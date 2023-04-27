package com.fredsonchaves07.domain.entities.exceptions;

public class ContentEmptyException extends RuntimeException{

    private final static String MESSAGE = "Content is empty";

    public ContentEmptyException() {
        super(MESSAGE);
    }
}
