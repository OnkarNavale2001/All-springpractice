package com.demo.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;

import com.demo.beans.Student;

public class StudentDao {
	@Autowired
    private HibernateTemplate template;

  
 

    @Transactional
    public void addStudent(Student s) {
        template.save(s);
        System.out.println("Data added successfully");
    }
    @Transactional
    public Student getdata() {
   return  template.get(Student.class,1);
    }
   
    
}
