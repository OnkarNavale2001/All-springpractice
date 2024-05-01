package com.in.Springjbcconnectivity;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.in.Student;
import com.in.StuentRowmaper;
import com.resources.Springcongjdbc;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Springcongjdbc.class);
		NamedParameterJdbcTemplate nm = context.getBean(NamedParameterJdbcTemplate.class);
//      MapSqlParameterSource param = new MapSqlParameterSource();
//      param.addValue("name", "sharan");
//      param.addValue("email", "sharan@.com");
//      String query = "insert  into details(name, email) values (:name, :email)";
//      int rowsAffected = nm.update(query, paramMap);
//     System.out.println("inserted data suucessfully");

   
//      String query="select * from details";
//  List< Student>  list=  nm.query(query, new StuentRowmaper());
//  for (Student student : list) {
//	System.out.println(student.getEmail()+" "+student.getName()+" "+student.getId());
//}
//      MapSqlParameterSource param = new MapSqlParameterSource();
//      paramMap.addValue("id", 5);
//

//      String query = "select * from details where  id = :id";
//      List<Student> list = nm.query(query, param, new StuentRowmaper());

//for (Student student : list) {
//	System.out.println(student.getEmail()+" "+student.getName()+" "+student.getId());
//	
//}
	}
}
