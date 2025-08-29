package com.paning.delet_user.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message){
        super(message);
    } 

    public UserNotFoundException(String message,Throwable cause){
        super(message,cause);
    }

}
