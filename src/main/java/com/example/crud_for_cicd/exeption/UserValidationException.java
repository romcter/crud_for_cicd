package com.example.crud_for_cicd.exeption;

public class UserValidationException extends RuntimeException {
    public UserValidationException(String message){
        super(message);
    }
}
