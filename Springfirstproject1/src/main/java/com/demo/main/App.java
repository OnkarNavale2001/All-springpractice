package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.in.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext container=new ClassPathXmlApplicationContext("/com/demo/resources/apllication.xml");
       Student st=container.getBean(Student.class,"stud");
       System.out.println(st.getName());
    }
}
