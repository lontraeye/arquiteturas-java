package com.meuprojeto.service;

import com.meuprojeto.business.UserBusiness;
import com.meuprojeto.data.User;

import java.util.List;

public class UserService {
    private UserBusiness business;

    public UserService(UserBusiness business) {
        this.business = business;
    }

    public void addUser(String name, int age) {
        business.createUser(name, age);
    }

    public User getUser(String name) {
        return business.getUserByName(name);
    }

    public List<User> listUsers() {
        return business.getAllUsers();
    }
}