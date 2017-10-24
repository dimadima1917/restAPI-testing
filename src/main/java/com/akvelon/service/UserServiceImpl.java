package com.akvelon.service;

import com.akvelon.dao.UserRepository;
import com.akvelon.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements com.akvelon.service.Service<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(int id) {
        return userRepository.findOne(id);
    }
}
