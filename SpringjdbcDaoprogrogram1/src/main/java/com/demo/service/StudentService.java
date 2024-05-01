package com.demo.service;

import com.demo.dao.StudentDao;
import com.demo.in.Student;

public class StudentService implements StudentSerinterface {
       private StudentDao d;
	
	public void setD(StudentDao d) {
		this.d = d;
	}
	public boolean adddata(Student s) {
		   return d.adddata(s);
		}
}
