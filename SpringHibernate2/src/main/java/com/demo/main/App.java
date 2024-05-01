package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.Dao.StudentDao;
import com.demo.beans.Student;
import com.demo.resources.Springconfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
          ApplicationContext applicationContext=new  AnnotationConfigApplicationContext(Springconfig.class);
         StudentDao st=applicationContext.getBean(StudentDao.class);
//         Student s=new Student();
//         s.setCity("pune");
//         s.setName("onkar");
//         s.setRollno(22);
//         
//         st.addStudent(s);
//         
         Student s=st.getdata();
         System.out.println(s.getCity()+" "+ s.getName());
         
         
         

    
    
    }

	
}
