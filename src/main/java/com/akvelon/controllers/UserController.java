package com.akvelon.controllers;

import com.akvelon.domain.User;
import com.akvelon.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Димон on 23.10.2017.
 */
@RestController
public class UserController {

    @Autowired
    Service<User> service;

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable(name = "id") int id) {
        return service.findById(id);
    }
}
