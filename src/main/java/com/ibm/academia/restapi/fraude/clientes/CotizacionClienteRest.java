package com.ibm.academia.restapi.fraude.clientes;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "api-cotizacion", url = "${url.fixer}")
public interface CotizacionClienteRest {

	@GetMapping("/latest?access_key=${accesskey.fixer}&symbols={monedaCodigoISO}")
	String buscarCotizacionXMoneda(@PathVariable String monedaCodigoISO);
	
}

