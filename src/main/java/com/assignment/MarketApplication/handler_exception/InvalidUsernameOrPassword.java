package com.assignment.MarketApplication.handler_exception;

public class InvalidUsernameOrPassword extends RuntimeException{
    public InvalidUsernameOrPassword(String message){
        super(message);
    }
}
