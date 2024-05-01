package com.demo.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.demo.in.Student;

import com.demo.resources.Javaconfig;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(Javaconfig.class);
		Student st = container.getBean(Student.class, "stud");
		System.out.println(st.getMap());
	}
}
