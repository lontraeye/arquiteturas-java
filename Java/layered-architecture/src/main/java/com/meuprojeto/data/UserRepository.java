package com.meuprojeto.data;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public User findUserByName(String name) {
        return users.stream()
                    .filter(user -> user.getName().equals(name))
                    .findFirst()
                    .orElse(null);
    }

    public List<User> getAllUsers() {
        return users;
    }
}