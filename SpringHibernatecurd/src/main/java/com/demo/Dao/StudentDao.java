package com.demo.Dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;

import com.demo.beans.Student;

public class StudentDao {
    private HibernateTemplate template;

    public StudentDao(HibernateTemplate template) {
        this.template = template;
    }

    public HibernateTemplate getTemplate() {
        return template;
    }

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
