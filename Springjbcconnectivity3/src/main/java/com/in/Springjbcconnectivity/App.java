package com.in.Springjbcconnectivity;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.demo.details;
import com.demo.detailsrowmapper;
import com.resources.Springcongjdbc;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Springcongjdbc.class);
		JdbcTemplate jd = (JdbcTemplate) context.getBean("obj2");
//		String query="select * from details";
//	List<details>list=	jd.query(query,new detailsrowmapper() ); 
//	for (details details : list) {
//		System.out.println(details.getEmail()+" "+details.getId()+" "+details.getName());
//	}
//		String query="select * from details where id=?";
//		
//		details d=(details) jd.queryForObject(query,new detailsrowmapper(),8);
//		System.out.println(d);
		
		
//		String query="select * from details where id=?";
//	List<details>list=	jd.query(query,new detailsrowmapper() ,8 ); 
//	for (details details : list) {
//		System.out.println(details.getEmail()+" "+details.getId()+" "+details.getName());
//	}
//		

		
		
	
		
		
		
	}
}
