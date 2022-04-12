package dao;

import entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;
import java.util.List;

public class StudentDAO {

    private HibernateTemplate hibernateTemplate;

    public StudentDAO(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public StudentDAO() {
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    public int insert(Student student) {
        //insert metod
        int i = (int) this.hibernateTemplate.save(student);
        return i;
    }

    @Transactional
    public void update(Student student) {

        this.hibernateTemplate.update(student);
    }

    @Transactional
    public void delete(int id) {
        Student student = this.hibernateTemplate.get(Student.class, id);
        this.hibernateTemplate.delete(student);
    }

    public Student getStudent(int id) {
        Student student = this.hibernateTemplate.get(Student.class, id);
        return student;
    }

    public List<Student> getAllStudents() {
        List<Student> students = this.hibernateTemplate.loadAll(Student.class);
        return students;

    }
}
