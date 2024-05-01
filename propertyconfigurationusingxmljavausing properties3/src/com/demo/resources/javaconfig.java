package com.demo.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.demo.in.Student;

@Configuration
@PropertySource("/com/demo/resources/Student.properties")
public class javaconfig {
	@Value("${Student.name}")
	private String name;
	@Value("${Student.roll}")
	private int roll;
	@Bean(name = "stud")
	public Student createobj() {
        Student student=new Student();
        student.setName(name);
        student.setRoll(roll);
        return student;
	}
}
