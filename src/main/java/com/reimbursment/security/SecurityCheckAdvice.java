package com.reimbursment.security;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityCheckAdvice{

	@Before("controller()")
	public void autheticationCheck(JoinPoint joinPoint)
			throws Throwable {
		System.out.println("Login Before advice");
		Object[] args = joinPoint.getArgs();
		for (Object object : args) {
			System.out.println(object);
		}
		
	}
	
	@Pointcut("within(com.reimbursment.controller.*)")
	public void controller() {
	}

}
