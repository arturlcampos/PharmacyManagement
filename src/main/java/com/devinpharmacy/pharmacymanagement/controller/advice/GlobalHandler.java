package com.devinpharmacy.pharmacymanagement.controller.advice;


import com.devinpharmacy.pharmacymanagement.controller.dto.ErrorResponse;
import com.devinpharmacy.pharmacymanagement.exception.BadRequestException;
import com.devinpharmacy.pharmacymanagement.exception.NotFoundException;
import com.devinpharmacy.pharmacymanagement.exception.ServerErrorException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleExceptions(
            Exception e
    ) {


        return ResponseEntity.internalServerError().body(new ErrorResponse(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR.value(), e));
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ErrorResponse> handleBadRequestExceptions(
            Exception e
    ) {
        return ResponseEntity.badRequest().body(new ErrorResponse(LocalDateTime.now(),HttpStatus.BAD_REQUEST.value(), e));
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponse> handleNotFoundExceptions(
            Exception e
    ) {
        return new ResponseEntity <ErrorResponse> (new ErrorResponse(LocalDateTime.now(),HttpStatus.NOT_FOUND.value(), e), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ServerErrorException.class)
    public ResponseEntity<ErrorResponse> handleServerErrorExceptions(
            Exception e
    ) {
        return new ResponseEntity <ErrorResponse> (new ErrorResponse(LocalDateTime.now(),HttpStatus.INTERNAL_SERVER_ERROR.value(), e), HttpStatus.INTERNAL_SERVER_ERROR);
    }



}
