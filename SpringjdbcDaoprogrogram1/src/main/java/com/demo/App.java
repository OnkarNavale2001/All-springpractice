package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.dao.StudentDao;
import com.demo.in.Student;
import com.demo.resources.Springconfigjava;
import com.demo.service.StudentService;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new AnnotationConfigApplicationContext(Springconfigjava.class);
       Student st=new Student();
       st.setContact("7447451304");
       st.setEmail("onkassss@gmail.com");
       st.setName("sharslala");
       StudentDao dao=context.getBean(StudentDao.class);
       StudentService s=context.getBean(StudentService.class);
     
          boolean status=  s.adddata(st);
         System.out.println("data addeds successfully");
       
    }
}
