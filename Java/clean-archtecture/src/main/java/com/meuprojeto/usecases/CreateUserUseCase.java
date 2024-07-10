package com.meuprojeto.usecases;

import com.meuprojeto.domain.entities.User;
import com.meuprojeto.gateways.UserRepository;

public class CreateUserUseCase {
    private UserRepository userRepository;

    public CreateUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void execute(String name, int age) {
        User user = new User(name, age);
        userRepository.save(user);
    }
}