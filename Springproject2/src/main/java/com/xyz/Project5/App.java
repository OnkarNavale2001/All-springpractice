package com.xyz.Project5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.Employee;
import com.demo.Student;
import com.resources.Javacongig;


public class App 
{
    public static void main( String[] args )
    {
         ApplicationContext container =new AnnotationConfigApplicationContext(Javacongig.class);
         Employee e=container.getBean(Employee.class);
         System.out.println(e.getAddress());
         
   
    
    
    
    }
}
