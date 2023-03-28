package com.example.java_jpa.controller;

import com.example.java_jpa.dao.UserRepository;
import com.example.java_jpa.domain.test_data;
import com.example.java_jpa.domain.user;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Zsw
 * @create 2023-03-28 11:02
 */
@RestController
public class UserController {

    @Resource
    private UserRepository userRepository;

    @RequestMapping("/")
    public List<user> getUsers() {
        return userRepository.getAll();
    }

}

