package com.demo.Aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class Aspectclass {

   @Around("execution(* com.demo.service.Banktransaction.upipayment(..))")
	public void paymentstarted(ProceedingJoinPoint joint) throws Throwable
	{
		System.out.println("----------paymentstart-------");
		joint.proceed();
		System.out.println("payment ended");
	}
}
