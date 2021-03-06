package com.ibm.academia.restapi.fraude.modelo.servicios;

import java.util.Optional;

import com.ibm.academia.restapi.fraude.modelo.entidad.Ip;

public interface IIpService {

	/**
	 * Método para buscar una ip
	 * @param ip - Parámetro de la ip
	 * @return Optional de tipo Ip
	 * @author Usuario - 23/05/2022
	 */
	public Optional<Ip> buscarIp(String ip);
	
	/**
	 * Método para banear una ip
	 * @param entidad - Objeto de Ip
	 * @return Objeto Ip
	 * @author Usuario - 23/05/2022
	 */
	public Ip banearIp(Ip entidad);
	
	/**
	 * Método para buscar todas las ip
	 * @return Iterable de tipo ip
	 * @author Usuario - 23/05/2022
	 */
	public Iterable<Ip> buscarTodas();
	
	/**
	 * Método para desbanear una ip
	 * @param ip - Paámetro de la ip
	 * @author Usuario - 23/05/2022
	 */
	public void desbanearIp(String ip);
	
}
