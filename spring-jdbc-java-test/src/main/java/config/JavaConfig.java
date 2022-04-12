package config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import dao.TeacherDAOImpl;

@Configuration
public class JavaConfig {

	@Bean(name = { "getDataSource" })
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dataSource.setUsername("root");
		dataSource.setPassword("Cs@2302$");
		return dataSource;
	}

	@Bean(name = { "getJDBCTemplate" })
	public JdbcTemplate getJDBCTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}

	@Bean(name = { "getTeacher" })
	public TeacherDAOImpl getTeacher() {
		TeacherDAOImpl impl = new TeacherDAOImpl();
		impl.setTemplate(getJDBCTemplate());
		return impl;
	}

}
