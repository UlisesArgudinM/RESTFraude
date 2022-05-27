package com.ibm.academia.restapi.fraude.modelo.mapper;

import com.ibm.academia.restapi.fraude.modelo.dto.FraudeDTO;
import com.ibm.academia.restapi.fraude.modelo.entidad.Moneda;
import com.ibm.academia.restapi.fraude.modelo.entidad.Pais;

public class FraudeMapper {

	public static FraudeDTO mapFraude(Pais pais, Moneda moneda) {
		FraudeDTO fraudeDTO = new FraudeDTO();
		
		fraudeDTO.setCodigoISOPais(pais.getCodigoISO());
		fraudeDTO.setNombrePais(pais.getNombre());
		fraudeDTO.setCodigoISOMoneda(moneda.getCodigoISO());
		fraudeDTO.setCotizacionEuros(moneda.getCotizacionEuros());
		
		return fraudeDTO;
	}
	
}
