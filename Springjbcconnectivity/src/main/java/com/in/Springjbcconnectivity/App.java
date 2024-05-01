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
public class App 
{
    public static void main( String[] args )
    {   
     ApplicationContext context=new AnnotationConfigApplicationContext(Springcongjdbc.class);
        JdbcTemplate jd=(JdbcTemplate) context.getBean("obj2");
       try {
		Connection con =jd.getDataSource().getConnection();
		if(con!=null)
		{
			System.out.println("successs");
			
		}
		else {
			System.out.println("not success");	
		}
	} catch (SQLException e) {
	
		e.printStackTrace();
	}
    }
}
