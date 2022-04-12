package com.spring.orm.javabased.dao;

import com.spring.orm.javabased.entities.HOD;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.transaction.Transactional;


public class HOD_Dao {
    private HibernateTemplate template;

    public HOD_Dao(HibernateTemplate template) {
        this.template = template;
    }

    public HOD_Dao() {
    }

    public HibernateTemplate getTemplate() {
        return template;
    }

    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }

    @Transactional
    public int insert(HOD hod) {
        Integer r = (Integer) this.template.save(hod);
        return r;
    }
    public HOD getTeacher(int id){
        HOD hod=this.template.get(HOD.class,id);
        return hod;
    }
}
