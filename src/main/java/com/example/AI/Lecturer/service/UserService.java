package com.example.AI.Lecturer.service;

import com.example.AI.Lecturer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    private UserRepository userRepository;
}
