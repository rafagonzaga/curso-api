package com.example.testes.api.config;

import com.example.testes.api.domain.User;
import com.example.testes.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB(){
        User u1 = new User(null, "Rafael", "ralozaga@gmail.com", "1234");
        User u2 = new User(null, "Pedro", "pedro@gmail.com", "p1p1");

        repository.saveAll(List.of(u1, u2));
    }
}
