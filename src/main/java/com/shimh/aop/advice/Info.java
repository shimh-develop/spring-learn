package com.shimh.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.IntroductionInterceptor;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class Info {
	
	
	public static void main(String[] args) {
		//MethodBeforeAdvice 之前
		//AfterReturningAdvice 返回
		//MethodInterceptor 环绕
		//ThrowsAdvice 抛出异常时
		//IntroductionInterceptor 引介增强 DelegatingIntroductionInterceptor

	}
}
