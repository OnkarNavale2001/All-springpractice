package com.demo.in;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
private int roll;
public int getRoll() {
	return roll;
}
@Value("222")
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
@Value("omkar")
public void setName(String name) {
	this.name = name;
}
private String name ;

}
