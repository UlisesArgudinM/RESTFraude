package com.ibm.academia.restapi.fraude.modelo.entidad;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class Moneda implements Serializable{

	private String codigoISO;
	private String nombre;
	private String simbolo;
	private BigDecimal cotizacionEuros;
	
	
	public Moneda(String codigoISO, String nombre, String simbolo) {
		this.codigoISO = codigoISO;
		this.nombre = nombre;
		this.simbolo = simbolo;
	}



	private static final long serialVersionUID = -8775009792973289183L;
}
