package com.spring.dao;


import com.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDAO {

    @Autowired
    HibernateTemplate template;

    @Transactional(readOnly = false)
    public int saveUser(User user) {
        return (int) this.template.save(user);
    }
}
