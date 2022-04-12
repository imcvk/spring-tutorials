package com.springjdbcorm.service;

import com.springjdbcorm.dao.UserDAO;
import com.springjdbcorm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

    public int createUser(User user) {
        return this.userDAO.saveUser(user);
    }
}
