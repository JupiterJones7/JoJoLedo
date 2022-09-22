package com.example.JoJoLedo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class JoJoLedoApplication {
public static void main(String[] args) {
		SpringApplication.run(JoJoLedoApplication.class, args);
	}

}
