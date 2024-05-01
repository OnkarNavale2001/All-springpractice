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
public class App 
{
    public static void main( String[] args )
    {   
     ApplicationContext context=new AnnotationConfigApplicationContext(Springcongjdbc.class);
      NamedParameterJdbcTemplate nm=context.getBean(NamedParameterJdbcTemplate.class);
//      Map<String,Object>  map=new HashMap<>();
//      map.put("name","omkar");
//      map.put("email", "zzzz");
//            String query="insert into details(name,email) values(:name,:email)";
//            
//      nm.update(query, map);
//     
//      String query="select * from details";
//  List< Student>  list=  nm.query(query, new StuentRowmaper());
//  for (Student student : list) {
//	System.out.println(student.getEmail()+" "+student.getName()+" "+student.getId());
//}
//      String query="select * from details where id=:id";
//      Map<String , Object> map=new HashMap<>();
//      map.put("id", 5);
// List<Student>list=   nm.query(query, map,new StuentRowmaper());
//
//for (Student student : list) {
//	System.out.println(student.getEmail()+" "+student.getName()+" "+student.getId());
//	
//}
//      String query ="delete from details where id=:id";
//      Map<String , Object> map=new HashMap<>();
//      map.put("id", 5);
//      nm.update(query, map);
//      System.out.println("delete successfully");
      
  String query = "update details set name = :name, email = :email WHERE id = :id";

      MapSqlParameterSource paramMap = new MapSqlParameterSource();
      paramMap.addValue("name", "sharan");
      paramMap.addValue("email", "raman");
      paramMap.addValue("id", 9);
  
    }
}
