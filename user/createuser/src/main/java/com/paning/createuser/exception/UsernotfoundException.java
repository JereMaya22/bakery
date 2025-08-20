package com.paning.createuser.exception;

public class UsernotfoundException extends RuntimeException{
    public UsernotfoundException(String message){
        super(message);
    }
    public UsernotfoundException(String message, Throwable cause){
        super(message, cause);
    }
}
