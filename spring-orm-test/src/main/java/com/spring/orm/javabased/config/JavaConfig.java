package com.spring.orm.javabased.config;

import com.spring.orm.javabased.dao.HOD_Dao;
import com.spring.orm.javabased.entities.HOD;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

@Configuration
@ComponentScan(basePackages = {"com.spring.orm.javabased.dao"})
@EnableTransactionManagement
public class JavaConfig {

    @Bean
    public DriverManagerDataSource getDriverManagerDataSource() {
        DriverManagerDataSource dMDS = new DriverManagerDataSource();
        dMDS.setDriverClassName("com.mysql.jdbc.Driver");
        dMDS.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        dMDS.setUsername("root");
        dMDS.setPassword("Cs@2302$");
        return dMDS;
    }

    @Bean
    public LocalSessionFactoryBean getLocalSessionFactoryBean() {
        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        localSessionFactoryBean.setDataSource(getDriverManagerDataSource());
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
        properties.setProperty("hibernate.show_sql", "true");
        properties.setProperty("hibernate.hbm2ddl.auto", "update");
        localSessionFactoryBean.setHibernateProperties(properties);
        localSessionFactoryBean.setAnnotatedClasses(HOD.class);
        return localSessionFactoryBean;
    }

    @Bean
    public HibernateTemplate getHibernateTemplate() {
        HibernateTemplate hibernateTemplate = new HibernateTemplate();
        hibernateTemplate.setSessionFactory(getLocalSessionFactoryBean().getObject());
        return hibernateTemplate;
    }

    @Bean
    public HOD_Dao getHod_dao() {
        HOD_Dao dao = new HOD_Dao();
        dao.setTemplate(getHibernateTemplate());
        return dao;
    }

    @Bean
    public HibernateTransactionManager getHibernateTransactionManager() {
        HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
        hibernateTransactionManager.setSessionFactory(getLocalSessionFactoryBean().getObject());
        return hibernateTransactionManager;
    }

}
