package com.library.demo.service;

import com.library.demo.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public BookService() {
    }

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook() {
        System.out.println("BookService : Adding Book");
        bookRepository.saveBook();
    }
}