package com.library.demo.service;

import com.library.demo.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook() {
        System.out.println("BookService is calling BookRepository...");
        bookRepository.saveBook();
    }
}