package com.in.Springjbcconnectivity;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.resources.Springcongjdbc;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Springcongjdbc.class);
		JdbcTemplate jd = (JdbcTemplate) context.getBean("obj2");
		try {
			Connection con = jd.getDataSource().getConnection();
			if (con != null) {
				System.out.println("successs");

			} else {
				System.out.println("not success");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		String sql="insert into details(name,email) values(?,?)";
		String name ="omkar";
		String email="onkar@gmail.com";
		jd.update(sql,name,email);
		System.out.println("succuessly added the values");
//		String sql1="delete from details where id=?";
//		int id=1;
//		jd.update(sql1,id);
//		System.out.println("succuessly deleted the id");
		String sql2="update details set name=?,email=? where id=? ";
		jd.update(sql2,"karan","karan@gmail.com" ,2);
		
		
		
	}
}
