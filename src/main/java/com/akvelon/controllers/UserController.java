package com.akvelon.controllers;

import com.akvelon.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Димон on 23.10.2017.
 */
@RestController
public class UserController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting")
    public User getUser(@RequestParam(value = "name",required = false,defaultValue = "World") String name){
        return new User(counter.incrementAndGet(),String.format(template, name));
    }
}
