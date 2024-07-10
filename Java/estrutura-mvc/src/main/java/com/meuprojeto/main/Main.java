package com.meuprojeto.main;

import com.meuprojeto.model.User;
import com.meuprojeto.controller.UserController;
import com.meuprojeto.view.UserView;

public class Main {
    public static void main(String[] args) {
        // Cria o modelo
        User model = new User("Alice", 25);

        // Cria a visão
        UserView view = new UserView();

        // Cria o controlador
        UserController controller = new UserController(model, view);

        // Atualiza a visão
        controller.updateView();

        // Modifica os dados do modelo
        controller.setUserName("Bob");
        controller.setUserAge(30);

        // Atualiza a visão novamente
        controller.updateView();
    }
}