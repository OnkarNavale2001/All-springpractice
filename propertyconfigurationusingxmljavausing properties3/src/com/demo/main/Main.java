package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.in.Student;
import com.demo.resources.javaconfig;

public class Main {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(javaconfig.class);
		Student st = container.getBean(Student.class, "stud");
		System.out.println(st.getName());
	}
}
