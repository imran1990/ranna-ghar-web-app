package com.rannaghar.web.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


import javax.sql.DataSource;
import java.sql.DriverManager;

@Configuration
public class DatabaseConfig {

    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");

        dataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/databasena");
        dataSource.setUsername("username");
        dataSource.setPassword("password");

        return dataSource;

        
    }


}
