package com.ibm.academia.restapi.fraude.excepciones;

public class BadRequestException extends RuntimeException{

	public BadRequestException(String mensaje){
		super(mensaje);
	}
	
	private static final long serialVersionUID = 7184840400717210043L;
}
