package com.meuprojeto.gateways;

import com.meuprojeto.domain.entities.User;

public interface UserRepository {
    void save(User user);
    User findByName(String name);
}