package com.ibm.academia.restapi.fraude.excepciones;

public class IpBaneadaException extends RuntimeException{

	public IpBaneadaException(String mensaje) {
		super(mensaje);
	}
	
	private static final long serialVersionUID = 1688426709783703138L;
}
