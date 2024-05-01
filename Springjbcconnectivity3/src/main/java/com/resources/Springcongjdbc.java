package com.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Springcongjdbc {
  
	@Bean
	public DriverManagerDataSource obj1()
	{
//							DriverManagerDataSource dataSource=new DriverManagerDataSource();
//							dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//							dataSource.setUrl("jdbc:mysql://localhost/springdata");
//							dataSource.setUsername("root");
//							dataSource.setPassword("root");
//							return dataSource;
		return new DriverManagerDataSource("jdbc:mysql://localhost/springdata","root","root");
				
	}
	@Bean
	public JdbcTemplate obj2()
	{
		JdbcTemplate jd=new JdbcTemplate();
		jd.setDataSource(obj1());
		return jd;
	}
		
		
		
		
		
		
	
	
	
}
