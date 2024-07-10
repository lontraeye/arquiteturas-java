package com.meuprojeto.service1.repository;

import com.meuprojeto.common.model.User;

public interface Service1Repository {
    void save(User user);
    User findByUsername(String username);
}