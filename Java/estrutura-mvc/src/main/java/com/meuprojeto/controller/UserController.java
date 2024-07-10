package com.meuprojeto.controller;

import com.meuprojeto.model.User;
import com.meuprojeto.view.UserView;

public class UserController {
    private User model;
    private UserView view;

    public UserController(User model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void setUserName(String name) {
        model.setName(name);
    }

    public String getUserName() {
        return model.getName();
    }

    public void setUserAge(int age) {
        model.setAge(age);
    }

    public int getUserAge() {
        return model.getAge();
    }

    public void updateView() {
        view.printUserDetails(model.getName(), model.getAge());
    }
}