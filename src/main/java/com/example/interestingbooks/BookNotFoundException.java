package com.example.interestingbooks;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(Integer id) {
        super("Book not found: " + id);
    }
}