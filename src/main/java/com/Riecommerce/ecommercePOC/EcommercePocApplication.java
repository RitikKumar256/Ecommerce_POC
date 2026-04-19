package com.Riecommerce.ecommercePOC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.Riecommerce.ecommercePOC.repository")
@EntityScan(basePackages = "com.Riecommerce.ecommercePOC.model")
public class EcommercePocApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommercePocApplication.class, args);
	}

}
