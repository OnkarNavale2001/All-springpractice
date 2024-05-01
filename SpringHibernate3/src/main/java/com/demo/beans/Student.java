package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studentdetails")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private int rollno;
private String city;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

}
