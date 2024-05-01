package com.demo.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.demo.dao.StudentDao;
import com.demo.service.StudentService;

@Configuration
@ComponentScan("com.demo")
public class Springconfigjava {
	@Bean
	public DriverManagerDataSource createobj() {
		return new DriverManagerDataSource("mysql:jdbc://localhost/student", "root", "root");

	}
	@Bean
	public JdbcTemplate createobj1()
	{
		return new JdbcTemplate(createobj());
	}
	
}
