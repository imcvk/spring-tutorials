package com.spring.dao;

import com.spring.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {
    JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int insert(Student student) {
        //insert.
        String query = "insert into student(id,name,city) values(?,?,?)";
        int r = this.template.update(query, student.getId(), student.getName(), student.getCity());
        return r;
    }


    public int update(Student student) {
        String query = "UPDATE student set name =?, city =? WHERE id =?";
        int r = this.template.update(query, student.getName(), student.getCity(), student.getId());
        return r;
    }


    public int delete(int id) {
        String query = "DELETE FROM student where id=?;";
        int r = this.template.update(query, id);
        return r;
    }

    public Student getStudent(int id) {
        String query = "select * FROM student where id=?";
        //implementing RowMapper<> interface
        RowMapper<Student> rm = new RowMapperImpl();
        Student student = this.template.queryForObject(query, rm, id);

        //using anonymous class
       /* Student student = this.template.queryForObject(query, new RowMapper<Student>() {
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setCity(rs.getString(3));
                return student;
            }
        }, id);*/
        return student;
    }


    public List<Student> getAllStudents() {
        String query = "SELECT * FROM student";
        return this.template.query(query, new RowMapperImpl());
    }
}
