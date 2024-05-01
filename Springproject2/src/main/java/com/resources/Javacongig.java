package com.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.Address;
import com.demo.Employee;

@Configuration

public class Javacongig {

	@Bean(name = "obj1")
	public Employee creaobjstd() {
		Employee E = new Employee();
		E.setName("omkar");
		E.setEmail("onkarnavle627@gmail.com");

		return E;

	}

	@Bean(name = "ad1")
	public Address createob() {
		Address ad = new Address();

		ad.setName("omkar");
		ad.setState("maharahtra");
		ad.setStreet("pine");

		return ad;
	}
	@Bean(name = "ad2")
	public Address createob1() {
		Address ad = new Address();

		ad.setName("omkar");
		ad.setState("maharahtra");
		ad.setStreet("pine");

		return ad;
	}

}
