package com.contact.model;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class Contact {
    private String email;
    private String userName;
    private String password;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dob;
    private String gender;
    private List<String> codingLanguages;
    private String database;

    @Override
    public String toString() {
        return "Contact{" +
                "email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", codingLanguages=" + codingLanguages +
                ", database='" + database + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getCodingLanguages() {
        return codingLanguages;
    }

    public void setCodingLanguages(List<String> codingLanguages) {
        this.codingLanguages = codingLanguages;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }
}
