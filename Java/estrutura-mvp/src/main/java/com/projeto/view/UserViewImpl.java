package com.meuprojeto.view;

public class UserViewImpl implements UserView {
    @Override
    public void showUserDetails(String name, int age) {
        System.out.println("User Details: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}