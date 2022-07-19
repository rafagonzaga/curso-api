package com.example.testes.api;

import com.example.testes.api.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);

//		User user = new User(1,"Rafael", "rafael@email.com", "1234");
	}

}
