package com.meuprojeto.main;

import com.meuprojeto.controllers.UserController;
import com.meuprojeto.gateways.UserRepository;
import com.meuprojeto.presenters.UserPresenter;
import com.meuprojeto.usecases.CreateUserUseCase;
import com.meuprojeto.usecases.GetUserUseCase;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepositoryImpl(); // Implementação fictícia do UserRepository
        CreateUserUseCase createUserUseCase = new CreateUserUseCase(userRepository);
        GetUserUseCase getUserUseCase = new GetUserUseCase(userRepository);
        UserPresenter userPresenter = new UserPresenter();
        UserController userController = new UserController(createUserUseCase, getUserUseCase, userPresenter);

        // Cria um usuário
        userController.createUser("Alice", 25);

        // Obtém e apresenta um usuário
        userController.getUser("Alice");
    }
}