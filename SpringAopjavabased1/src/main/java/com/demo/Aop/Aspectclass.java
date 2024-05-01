package com.demo.Aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Aspectclass {
   @Before("execution(* com.demo.service.Banktransaction.*(..))")
	public void paymentstarted()
	{
		System.out.println("----------paymentstart-------");
	}
}
