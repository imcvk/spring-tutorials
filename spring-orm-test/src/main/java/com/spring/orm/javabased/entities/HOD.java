package com.spring.orm.javabased.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hoddetails")
public class HOD {
    @Id
    @Column(name = "hodid")
    private int id;
    @Column(name = "hodname")
    private String name;
    @Column(name = "hoddept")
    private String dept;

    public HOD() {
    }

    public HOD(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
