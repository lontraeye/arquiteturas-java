package com.meuprojeto.adapters.input;

import com.meuprojeto.core.domain.entities.User;
import com.meuprojeto.adapters.output.UserRepository;

public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(String name, int age) {
        User user = new User(name, age);
        userRepository.save(user);
    }

    public User getUser(String name) {
        return userRepository.findByName(name);
    }
}