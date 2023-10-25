package com.java.exception.controller;

import com.java.exception.model.GenericDataDto;
import com.java.exception.service.CustomException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public interface GlobalExceptionalHandler {
    @ExceptionHandler(CustomException.class)
    ResponseEntity<GenericDataDto> handleCustomException(CustomException ex);
}
