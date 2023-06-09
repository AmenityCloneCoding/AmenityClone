package com.sparta.amenityclonecoding.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {ApiException.class})
    public ResponseEntity<ErrorResponse> handleApiException(ApiException apiException) {
        return ErrorResponse.toResponseEntity(apiException.getErrorCode());
    }

    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<ErrorResponse> handleRuntimeException(RuntimeException e) {
        e.printStackTrace();
        return ErrorResponse.toResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR, e.toString());
    }

}
