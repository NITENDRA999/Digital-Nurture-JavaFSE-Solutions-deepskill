package E_commerce_Platform_Search_Function;

import java.util.Arrays;
import java.util.Comparator;

public class EcommerceSearch {

    public static void main(String[] args) {

        Product[] products = {
                new Product(105, "Laptop", "Electronics"),
                new Product(101, "Phone", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(102, "Watch", "Accessories"),
                new Product(104, "Bag", "Fashion")
        };

        Product result1 = linearSearch(products, 103);
        System.out.println("Linear Search: " + result1);

        Arrays.sort(products,
                Comparator.comparingInt(p -> p.productId));

        Product result2 = binarySearch(products, 103);
        System.out.println("Binary Search: " + result2);
    }

    public static Product linearSearch(Product[] products, int targetId) {

        for (Product p : products) {
            if (p.productId == targetId) {
                return p;
            }
        }

        return null;
    }

    public static Product binarySearch(Product[] products, int targetId) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (products[mid].productId == targetId)
                return products[mid];

            if (products[mid].productId < targetId)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return null;
    }
}

/*
 * Big O Notation:
 * Used to measure the efficiency of an algorithm as input size grows.
 *
 * Linear Search:
 * Best Case    : O(1)
 * Average Case : O(n)
 * Worst Case   : O(n)
 *
 * Binary Search:
 * Best Case    : O(1)
 * Average Case : O(log n)
 * Worst Case   : O(log n)
 *
 * Binary Search is more efficient for large datasets
 * because it eliminates half of the search space in
 * every iteration. The array must be sorted before
 * performing Binary Search.
 */
