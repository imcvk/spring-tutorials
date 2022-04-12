package com.springmvc.service;

import com.springmvc.dao.UserDAO;
import com.springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public int createUser(User user) {
        return this.userDAO.saveUser(user);
    }
}
