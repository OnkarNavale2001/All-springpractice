package com.demo.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.in.Student;


public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
		container.register(Student.class);
		container.refresh();
		Student st = container.getBean(Student.class, "stud");
		System.out.println(st.getMap());
	}
}
