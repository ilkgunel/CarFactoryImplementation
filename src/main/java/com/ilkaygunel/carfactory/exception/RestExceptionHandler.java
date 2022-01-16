package com.ilkaygunel.carfactory.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NotSupportedCarTypeException.class)
    public ResponseEntity<Object> handleNotSupportedCarTypeException(NotSupportedCarTypeException notSupportedCarTypeException) {
        return buildResponseEntity(notSupportedCarTypeException);
    }

    private ResponseEntity<Object> buildResponseEntity(Exception ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_GATEWAY);
    }
}
