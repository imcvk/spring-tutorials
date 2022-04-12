package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"dao"})
public class JavaConfig {

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dMDS = new DriverManagerDataSource();
        dMDS.setDriverClassName("com.mysql.jdbc.Driver");
        dMDS.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        dMDS.setUsername("root");
        dMDS.setPassword("Cs@2302$");
        return dMDS;
    }

    @Bean
    public JdbcTemplate getJDBJdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }
}
