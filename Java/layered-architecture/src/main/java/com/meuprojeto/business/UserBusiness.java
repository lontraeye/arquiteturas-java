package com.meuprojeto.business;

import com.meuprojeto.data.User;
import com.meuprojeto.data.UserRepository;

import java.util.List;

public class UserBusiness {
    private UserRepository repository;

    public UserBusiness(UserRepository repository) {
        this.repository = repository;
    }

    public void createUser(String name, int age) {
        User user = new User(name, age);
        repository.addUser(user);
    }

    public User getUserByName(String name) {
        return repository.findUserByName(name);
    }

    public List<User> getAllUsers() {
        return repository.getAllUsers();
    }
}