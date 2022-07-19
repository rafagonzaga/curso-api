package com.example.testes.api.services;

import com.example.testes.api.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();
}
