package com.example.oenskeseddel.services;

import com.example.oenskeseddel.models.User;
import com.example.oenskeseddel.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String username, String mail, String name, String password) {
        return userRepository.save(new User(username, mail, name, password));
    }
}
