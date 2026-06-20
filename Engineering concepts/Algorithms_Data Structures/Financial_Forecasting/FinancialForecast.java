package Financial_Forecasting;

public class FinancialForecast {

    public static void main(String[] args) {

        double currentValue = 10000;
        double growthRate = 0.10; // 10%
        int years = 5;

        double futureValue = predictFutureValue(currentValue, growthRate, years);

        System.out.println("Current Value : " + currentValue);
        System.out.println("Growth Rate   : " + (growthRate * 100) + "%");
        System.out.println("Years         : " + years);
        System.out.println("Future Value  : " + futureValue);
    }
    public static double predictFutureValue(double currentValue, double growthRate, int years) {

        if (years == 0) {
            return currentValue;
        }

        return predictFutureValue(currentValue, growthRate, years - 1) * (1 + growthRate);
    }
}

/*
 * Recursion:
 * Recursion is a technique where a method calls itself
 * to solve smaller instances of the same problem.
 *
 * Financial Forecast Formula:
 * Future Value = Present Value × (1 + Growth Rate)^n
 *
 * Recursive Relation:
 * FV(n) = FV(n-1) × (1 + Growth Rate)
 *
 * Time Complexity: O(n)
 * One recursive call is made for each year.
 *
 * Space Complexity: O(n)
 * Due to recursive function call stack.
 *
 * Optimization:
 * Use Dynamic Programming (Memoization) or
 * the direct mathematical formula:
 *
 * FV = PV × Math.pow(1 + rate, years)
 *
 * This avoids excessive recursive calls.
 */
