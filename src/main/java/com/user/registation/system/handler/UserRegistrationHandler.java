package com.user.registation.system.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLIntegrityConstraintViolationException;

@RestControllerAdvice
public class UserRegistrationHandler {
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public ResponseEntity<String> sQLIntegrityConstraintViolationException(SQLIntegrityConstraintViolationException sqlException)
    {
        System.out.println("newly added line"); //second
        System.out.println("third commit");
        return new ResponseEntity<String>(sqlException.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
