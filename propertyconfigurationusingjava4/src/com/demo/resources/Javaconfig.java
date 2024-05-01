package com.demo.resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.in.Student;

@Configuration()
public class Javaconfig {
	@Bean(name = "stud")
	public Student create() {
		Student st1 = new Student();
		Map<String, Integer> map = new HashMap<>();
		map.put("java", 2);

		map.put("math", 2);
		map.put("c", 2);

		st1.setName("omkar");
		st1.setRoll(25);
		st1.setMap(map);

		return st1;

	}
}
