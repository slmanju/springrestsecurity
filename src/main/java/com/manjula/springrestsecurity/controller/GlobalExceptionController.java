package com.manjula.springrestsecurity.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by manjula on 11/25/17.
 */
@ControllerAdvice
public class GlobalExceptionController {

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Message> handleAllException(Exception e) {
        Message errorInfo = new Message("something is wrong");
        return new ResponseEntity<>(errorInfo, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ResponseBody
    public ResponseEntity<Message> noHandlerFound(HttpServletRequest req, NoHandlerFoundException ex) {
        String errorMessage = "Bad Url request";
        String errorURL = req.getRequestURL().toString();
        Message errorInfo = new Message(errorURL + " , " + errorMessage);
        return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
    }

}
