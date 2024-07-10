package com.meuprojeto.usecases;

import com.meuprojeto.domain.entities.User;
import com.meuprojeto.gateways.UserRepository;

public class GetUserUseCase {
    private UserRepository userRepository;

    public GetUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(String name) {
        return userRepository.findByName(name);
    }
}