package com.meuprojeto.main;

import com.meuprojeto.model.User;
import com.meuprojeto.view.UserView;
import com.meuprojeto.viewmodel.UserViewModel;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Cria o modelo
        User model = new User("Alice", 25);

        // Cria o view model
        UserViewModel viewModel = new UserViewModel(model);

        // Cria a visão
        UserView view = new UserView(viewModel);

        // Inicia a visão
        view.start(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}