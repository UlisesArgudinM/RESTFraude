package com.ibm.academia.restapi.fraude.excepciones.handler;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ibm.academia.restapi.fraude.excepciones.BadRequestException;
import com.ibm.academia.restapi.fraude.excepciones.IpBaneadaException;
import com.ibm.academia.restapi.fraude.excepciones.NotFoundException;


@ControllerAdvice
public class RESTIpException {

	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<String> noExisteException(NotFoundException exception){
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity<String> formatoInvalidoException(BadRequestException exception){
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(IpBaneadaException.class)
	public ResponseEntity<String> ipBaneadaException(IpBaneadaException exception){
		
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	
}

