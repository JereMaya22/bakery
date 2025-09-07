package com.paning.editemployee.exception;

public class invalidEmployeeDataException extends RuntimeException {
    public invalidEmployeeDataException(String message) {
        super(message);
    }

    public invalidEmployeeDataException(String message, Throwable cause) {
        super(message, cause);
    }

}
