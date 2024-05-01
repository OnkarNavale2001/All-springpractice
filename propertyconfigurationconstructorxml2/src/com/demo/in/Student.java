package com.demo.in;

public class Student {
	private int roll;
	private int marks;
	private String name;

	public Student(int roll, int marks, String name) {

		this.roll = roll;
		this.marks = marks;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public int getMarks() {
		return marks;
	}

	public String getName() {
		return name;
	}

}
