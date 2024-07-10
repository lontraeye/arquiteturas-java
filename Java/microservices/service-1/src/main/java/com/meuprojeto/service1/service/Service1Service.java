package com.meuprojeto.service1.service;

import com.meuprojeto.common.model.User;
import com.meuprojeto.service1.repository.Service1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service1Service {

    private final Service1Repository repository;

    @Autowired
    public Service1Service(Service1Repository repository) {
        this.repository = repository;
    }

    public void createUser(User user) {
        repository.save(user);
    }

    public User getUser(String username) {
        return repository.findByUsername(username);
    }
}