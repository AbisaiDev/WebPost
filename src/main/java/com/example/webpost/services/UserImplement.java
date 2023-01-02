package com.example.webpost.services;

import com.example.webpost.entities.User;
import com.example.webpost.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImplement implements UserService<User> {
    private final UserRepository userRepository;

    public UserImplement(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
