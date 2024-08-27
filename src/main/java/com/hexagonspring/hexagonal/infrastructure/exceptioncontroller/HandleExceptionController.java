package com.hexagonspring.hexagonal.infrastructure.exceptioncontroller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.hexagonspring.hexagonal.infrastructure.models.ErrorCustom;

@RestControllerAdvice
public class HandleExceptionController {

    @ExceptionHandler({ArithmeticException.class})
    public ResponseEntity<ErrorCustom> divisionByZero(Exception ex) {

        ErrorCustom error = new ErrorCustom();
        error.setDate(new Date());
        error.setError("Error division por cero!");
        error.setMessage(ex.getMessage());
        error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(error);
        
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<ErrorCustom> notFoundEx(NoHandlerFoundException e) {
        ErrorCustom error = new ErrorCustom();
        error.setDate(new Date());
        error.setError("Api rest no encontrado");
        error.setMessage(e.getMessage());

        error.setStatus(HttpStatus.NOT_FOUND.value());

        return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(error);
    }



}
