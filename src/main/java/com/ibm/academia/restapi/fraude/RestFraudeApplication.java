package com.ibm.academia.restapi.fraude;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class RestFraudeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestFraudeApplication.class, args);
	}

}
