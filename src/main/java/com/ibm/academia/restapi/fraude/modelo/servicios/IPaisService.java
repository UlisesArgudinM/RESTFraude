package com.ibm.academia.restapi.fraude.modelo.servicios;

import com.ibm.academia.restapi.fraude.modelo.entidad.Pais;

public interface IPaisService {

	/**
	 * Método para buscar país por ip
	 * @param ip - Parámetro de la ip
	 * @return Objeto tipo Pais
	 * @author Usuario - 24/05/2022
	 */
	Pais buscarPaisXIp(String ip);
	
}
