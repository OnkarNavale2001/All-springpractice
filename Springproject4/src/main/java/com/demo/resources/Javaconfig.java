package com.demo.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.in.Student;

@Configuration
@ComponentScan("com.demo.in")
public class Javaconfig {
	@Bean(name = "stud")
	public Student createobj() {
		Student st = new Student();
		st.setName("omkar");
		st.setRoll(22);

		return st;

	}

}
