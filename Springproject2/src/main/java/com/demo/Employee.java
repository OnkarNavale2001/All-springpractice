package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
 private String name,Email;
 public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}
@Autowired
@Qualifier("ad1")
private Address address;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}
 
}
