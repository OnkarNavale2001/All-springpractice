package com.demo.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.demo.Student;

public class Main {
	public static void main(String[] args) {
		
		
    Resource  resource=new ClassPathResource("/com/demo/resources/application.xml");
    BeanFactory container=new XmlBeanFactory(resource);
    Student student=(Student) container.getBean("stud");
    System.out.println(student.getName());
	}
}
