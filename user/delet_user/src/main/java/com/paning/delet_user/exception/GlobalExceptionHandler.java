package com.paning.delet_user.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.function.EntityResponse;

import com.paning.delet_user.modelDto.ErrorResponse;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public EntityResponse<ErrorResponse> handleUserNotFound(
        UserNotFoundException ex,
        HttpServletRequest request
    ){
        log.error("User not found: {}", ex.getMessage());

        ErrorResponse errorResponse = ErrorResponse.builder()
            .timestamp(LocalDateTime.now())
            .status(HttpStatus.NOT_FOUND.value())
            .error("Not found")
            .message(ex.getMessage())
            .path(request.getRequestURI())
            .build();

        return EntityResponse.fromObject(errorResponse).status(HttpStatus.NOT_FOUND).build();
        
    }

}
