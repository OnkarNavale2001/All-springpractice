package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.demo.in.Address;
import com.demo.in.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("/com/demo/resources/application.xml");

		Student st = container.getBean(Student.class);
		System.out.println(st.getName());
		Address ad = container.getBean(Address.class);
		System.out.println(ad.getCity());

	}
}
