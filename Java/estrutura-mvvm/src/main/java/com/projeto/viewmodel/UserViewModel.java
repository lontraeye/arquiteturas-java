package com.meuprojeto.viewmodel;

import com.meuprojeto.model.User;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class UserViewModel {
    private User model;
    private StringProperty name;
    private IntegerProperty age;

    public UserViewModel(User model) {
        this.model = model;
        this.name = new SimpleStringProperty(model.getName());
        this.age = new SimpleIntegerProperty(model.getAge());

        // Listeners to update the model when properties change
        this.name.addListener((obs, oldName, newName) -> model.setName(newName));
        this.age.addListener((obs, oldAge, newAge) -> model.setAge(newAge.intValue()));
    }

    public StringProperty nameProperty() {
        return name;
    }

    public IntegerProperty ageProperty() {
        return age;
    }
}