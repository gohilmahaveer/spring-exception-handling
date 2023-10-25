package com.java.exception.controller;

import com.java.exception.model.GenericDataDto;
import com.java.exception.service.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionalHandlerImpl implements GlobalExceptionalHandler {

    @Override
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<GenericDataDto> handleCustomException(final CustomException ex) {
        GenericDataDto genericDataDto = new GenericDataDto();
        genericDataDto.setResponseCode(HttpStatus.EXPECTATION_FAILED.value());
        genericDataDto.setResponseMessage("something went wrong");
        return new ResponseEntity<>(genericDataDto, HttpStatus.EXPECTATION_FAILED);
    }
}