package com.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.demo.Aop.Aspectclass;
import com.demo.service.Banktransaction;

@Configuration
@EnableAspectJAutoProxy
public class Springconfig {

	@Bean
	public Banktransaction traBanktransaction() {
		return new Banktransaction();
	}

	@Bean
	public Aspectclass aspectclass() {
		return new Aspectclass();
	}
}
