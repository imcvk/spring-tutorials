package com.spring.service;

import com.spring.dao.CredentialsDAO;
import com.spring.madel.Credentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class CredentialsService {
    @Autowired
    CredentialsDAO dao;

    public void addDetails(Credentials credentials) {
    this.dao.addCredentials(credentials);
    }

}
