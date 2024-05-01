package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.in.Address;
import com.demo.in.Student;
import com.demo.resources.Javaconfig;

public class App 
{
    public static void main( String[] args )
    {
AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext(Javaconfig.class);
				Student st=container.getBean(Student.class,"stud");
				System.out.println(st.getName());
				Address ad=container.getBean(Address.class);
				System.out.println(ad.getCity());

       
      
    }
}
