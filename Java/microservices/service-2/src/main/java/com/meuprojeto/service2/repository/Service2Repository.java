package com.meuprojeto.service2.repository;

import com.meuprojeto.common.model.User;

public interface Service2Repository {
    void save(User user);
    User findByUsername(String username);
}