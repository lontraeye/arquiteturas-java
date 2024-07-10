package com.meuprojeto.application;

import com.meuprojeto.adapters.input.UserController;
import com.meuprojeto.adapters.output.UserRepository;
import com.meuprojeto.frameworks.database.UserRepositoryImpl;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepositoryImpl();
        UserController userController = new UserController(userRepository);

        // Cria um usuário
        userController.createUser("Alice", 25);

        // Obtém e apresenta um usuário
        User user = userController.getUser("Alice");
        if (user != null) {
            System.out.println("User Details:");
            System.out.println("Name: " + user.getName());
            System.out.println("Age: " + user.getAge());
        } else {
            System.out.println("User not found.");
        }
    }
}