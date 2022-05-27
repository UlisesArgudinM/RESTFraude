package com.ibm.academia.restapi.fraude.clientes;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "api-moneda", url = "${url.restcountries}")
public interface MonedaClienteRest {
	
	@GetMapping("/alpha/{paisCodigoISO}?fields=currencies")
	String buscarMonedaXCodigoISOPais(@PathVariable String paisCodigoISO);
	
}
