package com.meuprojeto.presenters;

import com.meuprojeto.domain.entities.User;

public class UserPresenter {
    public void present(User user) {
        if (user != null) {
            System.out.println("User Details:");
            System.out.println("Name: " + user.getName());
            System.out.println("Age: " + user.getAge());
        } else {
            System.out.println("User not found.");
        }
    }
}