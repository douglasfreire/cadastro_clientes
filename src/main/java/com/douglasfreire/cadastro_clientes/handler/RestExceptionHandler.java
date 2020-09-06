package com.douglasfreire.cadastro_clientes.handler;

import com.douglasfreire.cadastro_clientes.error.ResourceNotFoundDetails;
import com.douglasfreire.cadastro_clientes.error.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;


//Permite utilizar essa classe nas diversas camadas que o spring possui.
@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<RestExceptionHandler> handlerResourceNotFoundException(ResourceNotFoundException resourceNotFoundException){
        ResourceNotFoundDetails build = ResourceNotFoundDetails
                .ResourceNotFoundDetailsBuilder
                .newBuilder()
                .timestamp(new Date().getTime())
                .status(HttpStatus.NOT_FOUND.value())
                .title("Resource Not Found")
                .detail(resourceNotFoundException.getMessage())
                .developerMessage(resourceNotFoundException.getClass().getName())
                .build();
        return new ResponseEntity(build, HttpStatus.NOT_FOUND);
    }
}
