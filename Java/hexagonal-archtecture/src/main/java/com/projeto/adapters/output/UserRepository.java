package com.meuprojeto.adapters.output;

import com.meuprojeto.core.domain.entities.User;

public interface UserRepository {
    void save(User user);
    User findByName(String name);
}