package com.meuprojeto.main;

import com.meuprojeto.business.UserBusiness;
import com.meuprojeto.data.UserRepository;
import com.meuprojeto.presentation.UserView;
import com.meuprojeto.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        UserBusiness userBusiness = new UserBusiness(userRepository);
        UserService userService = new UserService(userBusiness);
        UserView userView = new UserView(userService);

        // Adiciona alguns usuários
        userView.addUser("Alice", 25);
        userView.addUser("Bob", 30);

        // Mostra todos os usuários
        userView.showAllUsers();

        // Mostra detalhes de um usuário específico
        userView.showUserDetails("Alice");
    }
}