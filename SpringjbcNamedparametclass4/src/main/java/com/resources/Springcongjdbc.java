package com.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Springcongjdbc {
  
	@Bean
	public DriverManagerDataSource obj1()
	{

		return new DriverManagerDataSource("jdbc:mysql://localhost/springdata","root","root");				
	}
	@Bean
	public NamedParameterJdbcTemplate createobj()
	{
		return new NamedParameterJdbcTemplate(obj1());
	}
		
		  
		
		
		
		
	
	
	
}
