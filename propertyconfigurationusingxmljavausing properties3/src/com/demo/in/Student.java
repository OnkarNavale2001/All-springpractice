package com.demo.in;

import java.util.List;
import java.util.Map;

public class Student {
	private int roll;
	private String name;
	private Map<String, Integer> subject;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Integer> getSubject() {
		return subject;
	}

	public void setSubject(Map<String, Integer> subject) {
		this.subject = subject;
	}

}
