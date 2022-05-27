package com.ibm.academia.restapi.fraude.excepciones;

public class NotFoundException extends RuntimeException{

	public NotFoundException(String mensaje) {
		super(mensaje);
	}
	
	private static final long serialVersionUID = 3129028117047312392L;
}
