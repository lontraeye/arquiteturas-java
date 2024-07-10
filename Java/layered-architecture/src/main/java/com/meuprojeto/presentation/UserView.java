package com.meuprojeto.presentation;

import com.meuprojeto.data.User;
import com.meuprojeto.service.UserService;

public class UserView {
    private UserService service;

    public UserView(UserService service) {
        this.service = service;
    }

    public void showUserDetails(String name) {
        User user = service.getUser(name);
        if (user != null) {
            System.out.println("User Details: ");
            System.out.println("Name: " + user.getName());
            System.out.println("Age: " + user.getAge());
        } else {
            System.out.println("User not found.");
        }
    }

    public void showAllUsers() {
        service.listUsers().forEach(user -> {
            System.out.println("User: ");
            System.out.println("Name: " + user.getName());
            System.out.println("Age: " + user.getAge());
            System.out.println("------------");
        });
    }

    public void addUser(String name, int age) {
        service.addUser(name, age);
    }
}