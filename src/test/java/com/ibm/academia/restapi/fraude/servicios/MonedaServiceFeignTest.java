package com.ibm.academia.restapi.fraude.servicios;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ibm.academia.restapi.fraude.modelo.entidad.Moneda;
import com.ibm.academia.restapi.fraude.modelo.servicios.IMonedaService;

@SpringBootTest
public class MonedaServiceFeignTest {

	@Autowired
	private IMonedaService monedaService;
	
	@Test
	@DisplayName("Test: Buscar moneda por codigo del pais")
	void buscarMonedaPorCodigoISOPais() {
		
		String codigoISOPais = "US";
		
		Moneda moneda = monedaService.buscarMonedaXCodigoISOPais(codigoISOPais);
		
		assertThat(moneda.getCodigoISO()).isEqualTo("USD");
		assertThat(moneda.getCotizacionEuros()).isNull();
	}

	@Test
	@DisplayName("Test: Buscar cotizacion por moneda")
	void buscarCotizacionPorMoneda() {

		Moneda moneda = new Moneda("USD", "United States dollar", "$");
		
		moneda = monedaService.buscarCotizacionXMoneda(moneda);
		
		assertThat(moneda.getCotizacionEuros()).isGreaterThan(new BigDecimal(1));
		assertThat(moneda.getCotizacionEuros()).isNotNegative();
		
	}
	
}
