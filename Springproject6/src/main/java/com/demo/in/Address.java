package com.demo.in;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("address")
@Scope("prototype")    
public class Address {
	
private String street,city ,state;

public String getStreet() {
	return street;
}
@Value("roadnob")
public void setStreet(String street) {
	this.street = street;
}

public String getCity() {
	return city;
}
@Value("pune")
public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}
@Value("maharahtra")
public void setState(String state) {
	this.state = state;
}


}
