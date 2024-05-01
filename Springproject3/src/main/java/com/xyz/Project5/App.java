package com.xyz.Project5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.Student;
import com.resources.Javacongig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         ApplicationContext container =new AnnotationConfigApplicationContext(Javacongig.class);
         Student st=container.getBean(Student.class);
         System.out.println(st.getAddress());
    
    
    
    }
}
