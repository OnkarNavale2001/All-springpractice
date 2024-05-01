package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.in.Student;
@Service
public class StudentService implements StudentSerinterface {
	 @Autowired
       private StudentDao d;
	
	public void setD(StudentDao d) {
		this.d = d;
	}
	public boolean adddata(Student s) {
		   return d.adddata(s);
		}
}
