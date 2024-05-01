package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
private String name,Street,state;

public String getName() {
	return name;
}
@Value("road no 11 b")
public void setName(String name) {
	this.name = name;
}

public String getStreet() {
	return Street;
}
@Value("mumbai ")
public void setStreet(String street) {
	Street = street;
}

public String getState() {
	return state;
}
@Value("Maharahtra")
public void setState(String state) {
	this.state = state;
}

}
