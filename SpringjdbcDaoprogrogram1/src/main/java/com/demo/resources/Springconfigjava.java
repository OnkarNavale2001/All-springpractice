package com.demo.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.demo.dao.StudentDao;
import com.demo.service.StudentService;

@Configuration

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
	@Bean
	public StudentDao createobj3()
	{
		StudentDao d=new StudentDao();
		d.setJd(createobj1());
		return d;
	}
	@Bean
	public StudentService createobj4()
	{
		StudentService st=new StudentService();
		st.setD(createobj3());
		return st;
	}
}
