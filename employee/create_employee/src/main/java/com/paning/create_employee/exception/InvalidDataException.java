package com.paning.create_employee.exception;

public class InvalidDataException extends RuntimeException{
    public InvalidDataException(String message){
        super(message);
    }

    public InvalidDataException(String message, Throwable cause){
        super(message,cause);
    }

}
