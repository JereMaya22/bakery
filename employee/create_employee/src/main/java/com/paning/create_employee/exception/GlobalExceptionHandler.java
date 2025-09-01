package com.paning.create_employee.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;

import com.paning.create_employee.modeldto.ErrorResponse;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    // Handle InvalidDataException
    @ExceptionHandler(InvalidDataException.class)
    public ResponseEntity<ErrorResponse> handlerEmployeeInvalidData(
        InvalidDataException ex,
        HttpServletRequest request
    ){
        ErrorResponse errorResponse = ErrorResponse.builder()
            .timestamp(LocalDateTime.now())
            .status(HttpStatus.BAD_REQUEST.value())
            .error("Bad Request")
            .message(ex.getMessage())
            .path(request.getRequestURI())
            .build();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);

    }

    // Handle EmployeeAlreadyExistException
    @ExceptionHandler(EmployeeAlreadyExistException.class)
    public ResponseEntity<ErrorResponse> HandlerEmployeeAlreadyExists(
        EmployeeAlreadyExistException ex,
        HttpServletRequest request
    ){
        ErrorResponse errorResponse = ErrorResponse.builder()
            .timestamp(LocalDateTime.now())
            .status(HttpStatus.CONFLICT.value())
            .error("Employee Already exists")
            .message(ex.getMessage())
            .path(request.getRequestURI())
            .build();
        return ResponseEntity.status(HttpStatus.CONFLICT).body(errorResponse);
    }
}

