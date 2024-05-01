package com.demo.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.demo.Student;

public class Main {
	public static void main(String[] args) {

ApplicationContext  container= new ClassPathXmlApplicationContext("/com/demo/resources/application.xml");
		Student student = (Student) container.getBean("stud");
		System.out.println(student.getName());
	}
}
