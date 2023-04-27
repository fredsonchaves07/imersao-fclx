package com.fredsonchaves07.domain.entities.exceptions;

public class InvalidRoleException extends RuntimeException{

    private final static String MESSAGE = "Invalid Role";

    public InvalidRoleException() {
        super(MESSAGE);
    }
}
