package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.in.Student;
@Repository
public class StudentDao implements StudentInterface{
	@Autowired
     private JdbcTemplate jd;
   

	@Override
	public boolean adddata(Student s) {
		boolean status=false;
		
		String query ="insert into stud(name,email,contact";
		int count=jd.update(query,s.getName(),s.getEmail(),s.getContact());
		if(count>0)
		{
			status=true;
		}
		else
		{
			status =false;
		}
	return status;
	}

	public void setJd(JdbcTemplate jd) {
		this.jd = jd;
	}

}
