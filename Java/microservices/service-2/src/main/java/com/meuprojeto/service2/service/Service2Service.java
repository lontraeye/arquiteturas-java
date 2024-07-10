package com.meuprojeto.service2.service;

import com.meuprojeto.common.model.User;
import com.meuprojeto.service2.repository.Service2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service2Service {

    private final Service2Repository repository;

    @Autowired
    public Service2Service(Service2Repository repository) {
        this.repository = repository;
    }

    public void createUser(User user) {
        repository.save(user);
    }

    public User getUser(String username) {
        return repository.findByUsername(username);
    }
}