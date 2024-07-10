package com.meuprojeto.service2.controller;

import com.meuprojeto.common.model.User;
import com.meuprojeto.service2.service.Service2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/service2")
public class Service2Controller {

    private final Service2Service service;

    @Autowired
    public Service2Controller(Service2Service service) {
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