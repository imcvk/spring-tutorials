package com.spring.orm.xml.dao;

import com.spring.orm.xml.entities.Teacher;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;

public class TeacherDAO {
    private HibernateTemplate template;

    public TeacherDAO(HibernateTemplate template) {
        this.template = template;
    }

    public TeacherDAO() {
    }

    public HibernateTemplate getTemplate() {
        return template;
    }

    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }

    @Transactional
    public int insert(Teacher t) {
        Integer r = (Integer) this.template.save(t);
        return r;
    }
    public Teacher getTeacher(int id){
        Teacher t=this.template.get(Teacher.class,id);
        return t;
    }
}
