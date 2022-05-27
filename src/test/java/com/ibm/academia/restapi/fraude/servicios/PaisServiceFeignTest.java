package com.ibm.academia.restapi.fraude.servicios;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ibm.academia.restapi.fraude.modelo.servicios.IPaisService;
import com.ibm.academia.restapi.fraude.modelo.entidad.Pais;

@SpringBootTest
public class PaisServiceFeignTest {
	
	@Autowired
	private IPaisService paisService;
	
	@Test
	@DisplayName("Test: Buscar pais por ip")
	void buscarPaisPorIp() {
		
		String ip = "5.6.7.8";
		
		Pais pais = paisService.buscarPaisXIp(ip);
		
		assertThat(pais.getCodigoISO()).isNotNull();
		assertThat(pais.getCodigoISO()).hasSize(2);
		assertThat(pais.getNombre()).isEqualTo("Alemania");
	}
	
}
