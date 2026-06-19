package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private  BookRepository bookRepository;
    private final String serviceName;

    // Constructor Injection
    public BookService(String serviceName) {
        this.serviceName = serviceName;
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayService() {
        System.out.println("Book Service Working");
        System.out.println(serviceName);
        bookRepository.getBook();
    }
}