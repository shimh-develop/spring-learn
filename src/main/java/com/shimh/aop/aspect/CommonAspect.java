package com.shimh.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CommonAspect {

    // 1.@annotation @LogAnnotation只能标注到方法上，在类上不可以，会匹配不到
    @Pointcut("@annotation(com.shimh.aop.aspect.LogAnnotation)")
	public void annotationTest(){};

    @Before("annotationTest()")
    public void annotationTestAdvice() {
        System.out.println("切面@annotation：CommonAspect.annotationTestAdvice()");
    }


    // 2.within 指定类
    @Pointcut("within(com.shimh.aop.aspect.AspectTarget)")
    public void withinTest(){};

    @Before("withinTest()")
    public void withinTestAdvice() {
        System.out.println("切面within：CommonAspect.withinTestAdvice()");
    }
	
}
