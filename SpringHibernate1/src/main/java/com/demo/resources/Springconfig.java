package com.demo.resources;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.demo.Dao.StudentDao;

@Configuration
@EnableTransactionManagement
public class Springconfig {
	@Bean
	public DriverManagerDataSource datasourse() {
		return new DriverManagerDataSource("jdbc:mysql://localhost:3306/hibernate_db", "root", "root");
	}

	@Bean
	public LocalSessionFactoryBean local() {
		LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
		bean.setDataSource(datasourse());
		Properties prop = new Properties();
		prop.setProperty("hibernate.hbm2ddl.auto", "update");
		prop.setProperty("hibernate.show_sql", "true");
		prop.setProperty("hibernate.format_sql", "true");
		bean.setHibernateProperties(prop);
		bean.setMappingResources("/com/demo/resources/student.hbm.xml");

		return bean;

	}
	@Bean
     public HibernateTemplate myHibernateTemplate()
     {
    	 return new HibernateTemplate(local().getObject());
     }
     @Bean
     public HibernateTransactionManager transaction()
     {
    	 return new HibernateTransactionManager(local().getObject());
     }
     @Bean 
     public StudentDao student()
     {
    	   return new StudentDao(myHibernateTemplate());
     }
}
