package com.example.interestingbooks;

public class DuplicateBookException extends RuntimeException {

    public DuplicateBookException(String title) {
        super("Book already exists: " + title);
    }
}