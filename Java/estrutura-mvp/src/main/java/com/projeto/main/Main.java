package com.meuprojeto.main;

import com.meuprojeto.model.User;
import com.meuprojeto.presenter.UserPresenter;
import com.meuprojeto.view.UserViewImpl;

public class Main {
    public static void main(String[] args) {
        // Cria o modelo
        User model = new User("Alice", 25);

        // Cria a visão
        UserViewImpl view = new UserViewImpl();

        // Cria o presenter
        UserPresenter presenter = new UserPresenter(model, view);

        // Atualiza a visão
        presenter.updateView();

        // Modifica os dados do modelo
        presenter.setUserName("Bob");
        presenter.setUserAge(30);

        // Atualiza a visão novamente
        presenter.updateView();
    }
}