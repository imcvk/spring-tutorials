package com.spring.service;

import com.spring.dao.UserDAO;
import com.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

    public void createUser(User user) {
        userDAO.saveUser(user);
    }
}
