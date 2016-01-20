package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan(basePackageClasses = com.example.service.ExampleIntegrationService.class)
@EnableTransactionManagement
public class NominTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(NominTestApplication.class, args);
	}
}
