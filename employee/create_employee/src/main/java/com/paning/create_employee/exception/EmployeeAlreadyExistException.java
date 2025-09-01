package com.paning.create_employee.exception;

public class EmployeeAlreadyExistException extends RuntimeException{
    public EmployeeAlreadyExistException(String message){
        super(message);
    }

    public EmployeeAlreadyExistException(String message, Throwable cause){
        super(message, cause);
    }

}
