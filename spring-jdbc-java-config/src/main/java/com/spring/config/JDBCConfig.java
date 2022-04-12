package com.spring.config;


import com.spring.dao.StudentDAO;
import com.spring.dao.StudentDAOImpl;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configurable
public class JDBCConfig {
    @Bean(name = {"dMDS"})
    public DataSource getDataSource() {
        DriverManagerDataSource dMDS = new DriverManagerDataSource();
        dMDS.setDriverClassName("com.mysql.jdbc.Driver");
        dMDS.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        dMDS.setUsername("root");
        dMDS.setPassword("Cs@2302$");
        return dMDS;
    }

    @Bean(name = {"template"})
    public JdbcTemplate getJdbcTemplate() {
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(getDataSource());
        return template;
    }

    @Bean(name = {"studentDAO"})
    public StudentDAO getStudentDao() {
        StudentDAOImpl studentDAO = new StudentDAOImpl();
        studentDAO.setTemplate(getJdbcTemplate());
        return studentDAO;
    }

}
