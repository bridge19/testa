package com.adam.testa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableFeignClients
public class TestaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestaApplication.class, args);
	}
}
