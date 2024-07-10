package com.meuprojeto.controllers;

import com.meuprojeto.domain.entities.User;
import com.meuprojeto.presenters.UserPresenter;
import com.meuprojeto.usecases.CreateUserUseCase;
import com.meuprojeto.usecases.GetUserUseCase;

public class UserController {
    private CreateUserUseCase createUserUseCase;
    private GetUserUseCase getUserUseCase;
    private UserPresenter userPresenter;

    public UserController(CreateUserUseCase createUserUseCase, GetUserUseCase getUserUseCase, UserPresenter userPresenter) {
        this.createUserUseCase = createUserUseCase;
        this.getUserUseCase = getUserUseCase;
        this.userPresenter = userPresenter;
    }

    public void createUser(String name, int age) {
        createUserUseCase.execute(name, age);
    }

    public void getUser(String name) {
        User user = getUserUseCase.execute(name);
        userPresenter.present(user);
    }
}