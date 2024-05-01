package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
  private String name,email;
  private Address address;
public Student(@Value("omkar") String name, @Value("email@gmail.com")  String email, Address address) {
	super();
	this.name = name;
	this.email = email;
	this.address = address;
}
public Address getAddress() {
	return address;
}
  
}
