package com.example.emitterdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EmitterdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmitterdemoApplication.class, args);
	}

}
