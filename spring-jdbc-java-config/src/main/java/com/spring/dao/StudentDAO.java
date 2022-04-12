package com.spring.dao;

import com.spring.entities.Student;

import java.util.List;

public interface StudentDAO {
    public int insert(Student student);
    public int update(Student student);
    public int delete(int id);
    public Student getStudent(int id);
    public List<Student> getAllStudents();
}
