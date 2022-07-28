package com.example.testes.api.resources;

import com.example.testes.api.domain.User;
import com.example.testes.api.domain.dto.UserDTO;
import com.example.testes.api.services.Impl.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserResourceTest {

    public static final Integer ID      = 1;
    public static final int INDEX = 0;
    public static final String NAME     = "Rafael";
    public static final String EMAIL    = "ralozaga@gmail.com";
    public static final String PASSWORD = "1234";

    private User user;
    private UserDTO userDTO;

    @InjectMocks
    private UserResource userResource;

    @Mock
    private UserServiceImpl service;

    @Mock
    private ModelMapper mapper;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startUsers();
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    private void startUsers(){
        user = new User(ID, NAME, EMAIL, PASSWORD);
        userDTO = new UserDTO(ID, NAME, EMAIL, PASSWORD);
    }
}