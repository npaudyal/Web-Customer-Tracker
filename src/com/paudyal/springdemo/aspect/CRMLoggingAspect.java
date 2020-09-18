package com.paudyal.springdemo.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {
	
	//setup logger
	private Logger myLogger = Logger.getLogger(getClass().getName());
	
	//setup pointcut
	@Pointcut("execution(* com.paudyal.springdemo.controller.*.*(..))")
	private void forControllerPackage() {
		
	}
	@Pointcut("execution(* com.paudyal.springdemo.service.*.*(..))")
	private void forServicePackage() {
		
	}
	@Pointcut("execution(* com.paudyal.springdemo.dao.*.*(..))")
	private void forDaoPackage() {
		
	}
	@Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
	private void forAppFlow() {
		
	}
	
	//@Before
	@Before("forAppFlow()")
	public void before(JoinPoint theJoinPoint) {
		//display the method
		String theMethod = theJoinPoint.getSignature().toShortString();
		myLogger.info("====> in @Before: calling method: " + theMethod);
		
		
		//display the argument
		
		
	}
	
	
	
	
	//@After
	
}
