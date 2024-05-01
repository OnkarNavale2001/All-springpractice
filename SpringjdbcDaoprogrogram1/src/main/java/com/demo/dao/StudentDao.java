package com.demo.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.demo.in.Student;

public class StudentDao implements StudentInterface{
     private JdbcTemplate jd;
   

	@Override
	public boolean adddata(Student s) {
		boolean status=false;
		
		String query ="insert into stud(name,email,contact) values(?,?,?)";
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
