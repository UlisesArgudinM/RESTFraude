package com.ibm.academia.restapi.fraude.modelo.servicios;

import com.ibm.academia.restapi.fraude.modelo.entidad.Moneda;

public interface IMonedaService {

	/**
	 * Método para buscar moneda por codigo iso de país
	 * @param codigoISOPais - Parámetro del codigo iso del país
	 * @return Objeto tipo Moneda
	 * @author Usuario - 24/05/2022
	 */
	Moneda buscarMonedaXCodigoISOPais(String codigoISOPais);
	
	/**
	 * Método para buscar cotizacion en euros por codigo iso de moneda
	 * @param moneda - Objeto tipo moneda con atributo no nulo de codigo iso
	 * @return Objeto Moneda con datos existentes en el parámetro y cotizacion en euros
	 * @author Usuario - 24/05/2022
	 */
	Moneda buscarCotizacionXMoneda(Moneda moneda);
	
}
