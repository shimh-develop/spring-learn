package com.shimh.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class UserAspect {
	
	//@Pointcut("execution(public * com.shimh.common.User.getName())")
	//public void pointcut(){}
	
	
	@Pointcut("execution(public * com.shimh.common.User.getName())")
	public void pointcut(){}
	
	
	@Around("pointcut()")
	public Object aroudnAdvice(ProceedingJoinPoint point) throws Throwable{
		
		
		System.out.println("调用getName开始。。。。");
		
		Object o = point.proceed();
		
			
		System.out.println("调用getName结束。。。。");
		
		return o ;
	}
	
	
	
}
