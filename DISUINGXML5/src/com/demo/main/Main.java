package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.in.Student;

public class Main {
	public static void main(String[] args) {
       ApplicationContext container =
    		   new ClassPathXmlApplicationContext("/com/demo/resources/application.xml");
       Student st=container.getBean(Student.class,"stud");
       System.out.println(st.getAddress());
       
	}
}
