package com.etaskify.az.excepetion;

public class EmailAlreadyUsedException extends RuntimeException{
    public EmailAlreadyUsedException(String message) {
        super(message);
    }
}
