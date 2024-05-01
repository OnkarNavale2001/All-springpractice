package com.demo.resources;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.in.Student;

@Configuration()
public class Javaconfig {
	@Bean(name = "stud")
	public Student create() {
		Student st1 = new Student();
		ArrayList<String> st = new ArrayList<>();
		st.add("omkar");
		st.add("karan");
		st.add("good");

		st1.setName("omkar");
		st1.setRoll(25);
		st1.setList(st);

		return st1;

	}
}
