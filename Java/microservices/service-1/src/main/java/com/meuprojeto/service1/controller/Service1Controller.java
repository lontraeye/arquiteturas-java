package com.meuprojeto.service1.controller;

import com.meuprojeto.common.model.User;
import com.meuprojeto.service1.service.Service1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/service1")
public class Service1Controller {

    private final Service1Service service;

    @Autowired
    public Service1Controller(Service1Service service) {
        this.service = service;
    }

    @PostMapping("/user")
    public void createUser(@RequestBody User user) {
        service.createUser(user);
    }

    @GetMapping("/user/{username}")
    public User getUser(@PathVariable String username) {
        return service.getUser(username);
    }
}