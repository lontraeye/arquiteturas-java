package com.meuprojeto.frameworks.database;

import com.meuprojeto.core.domain.entities.User;
import com.meuprojeto.adapters.output.UserRepository;

import java.util.HashMap;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {
    private Map<String, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        users.put(user.getName(), user);
    }

    @Override
    public User findByName(String name) {
        return users.get(name);
    }
}