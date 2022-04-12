package com.spring.dao;

import com.spring.madel.Credentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CredentialsDAO {
    @Autowired
    HibernateTemplate template;
    @Transactional(readOnly = false)
    public void addCredentials(Credentials credentials) {
        this.template.save(credentials);
    }
}
