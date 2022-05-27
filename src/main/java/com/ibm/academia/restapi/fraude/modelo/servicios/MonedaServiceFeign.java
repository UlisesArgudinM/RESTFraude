package com.ibm.academia.restapi.fraude.modelo.servicios;

import java.math.BigDecimal;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.academia.restapi.fraude.clientes.CotizacionClienteRest;
import com.ibm.academia.restapi.fraude.clientes.MonedaClienteRest;
import com.ibm.academia.restapi.fraude.modelo.entidad.Moneda;

@Service
public class MonedaServiceFeign implements IMonedaService{

	@Autowired
	private MonedaClienteRest monedaCliente;
	
	@Autowired
	private CotizacionClienteRest cotizacionCliente;
	
	@Override
	public Moneda buscarMonedaXCodigoISOPais(String codigoISOPais) {
		JSONObject monedaJSON = new JSONObject(monedaCliente.buscarMonedaXCodigoISOPais(codigoISOPais));
		String codigoISO = (String) monedaJSON.getJSONArray("currencies").getJSONObject(0).get("code");
		String nombre = (String) monedaJSON.getJSONArray("currencies").getJSONObject(0).get("name");
		String simbolo = (String) monedaJSON.getJSONArray("currencies").getJSONObject(0).get("symbol");
		
		return new Moneda(codigoISO, nombre, simbolo);
	}

	@Override
	public Moneda buscarCotizacionXMoneda(Moneda moneda) {
		JSONObject cotizacionJSON = new JSONObject(cotizacionCliente.buscarCotizacionXMoneda(moneda.getCodigoISO()));	
		moneda.setCotizacionEuros(new BigDecimal(cotizacionJSON.getJSONObject("rates").get(moneda.getCodigoISO()).toString()));
		return moneda;
	}
	
}
