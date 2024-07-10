package com.meuprojeto.view;

import com.meuprojeto.viewmodel.UserViewModel;

import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UserView {

    private UserViewModel viewModel;

    public UserView(UserViewModel viewModel) {
        this.viewModel = viewModel;
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("MVVM Example");

        TextField nameField = new TextField();
        nameField.textProperty().bindBidirectional(viewModel.nameProperty());

        TextField ageField = new TextField();
        ageField.textProperty().bindBidirectional(viewModel.ageProperty().asString());

        Label nameLabel = new Label();
        nameLabel.textProperty().bind(Bindings.format("Name: %s", viewModel.nameProperty()));

        Label ageLabel = new Label();
        ageLabel.textProperty().bind(Bindings.format("Age: %s", viewModel.ageProperty()));

        VBox vbox = new VBox(nameField, ageField, nameLabel, ageLabel);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}