package az.atlacademy.springbootjdbcexample.config;

import javax.sql.DataSource;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Data
@Configuration
@ComponentScan("az.atlacademy.springbootjdbcexample")
@PropertySource("classpath:application.yml")
public class DatabaseConfig {

    @Bean
    @Primary
    public DataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/postgres");
        driverManagerDataSource.setUsername("postgres");
        driverManagerDataSource.setPassword("postgres");
        driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
        return driverManagerDataSource;
    }

}
