package com.shimh.aop.annotation;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

import com.shimh.common.User;

/*
 * 	基于注解的切面
 * 		@Aspect	有两种方式将Aspect织入目标对象   @see main()
 *		
 *		pointcut表达式   @see pointcut()
 */

public class Info {

	public static void main(String[] args) {
		
		//方式-  编程的方式织入
		User u = new User();
		AspectJProxyFactory factory = new AspectJProxyFactory();
		factory.setTarget(u);
		factory.addAspect(UserAspect.class);

		User uProxy = factory.getProxy();
		
		System.out.println(uProxy.getName());
		
		
		//方式二      自动代理织入
		// 1  在 spring。xml 中配置 AnnotationAwareAspectJAutoProxyCreator, 自动收集容器的Aspect
		//AnnotationAwareAspectJAutoProxyCreator
		// 2 在 spring。xml 配置 <aop:aspectj-autoproxy/> === javaconfig  @EnableAspectJAutoProxy 
	}
	
	
	public void pointcut(){
		/**
		 * execution(public * com.shimh.common.*.getName()) com.shimh.common这一层下的所有类型
		 * execution(public * com.shimh.common..*.getName()) com.shimh.common包及子包的所有类型
		 * 
		 * 
		 * within:只接受类型参数，如我们在指定某个类后，它将匹配该类下所有声明的方法
		 * 	within(com.shimh.common.*) com.shimh.common包下所有类的所有方法
		 * 	within(com.shimh.common.。*) com.shimh.common包下及子 包下的所有类的所有方法
		 * 
		 * this target:this指代目标对象的代理对象，target指代目标对象。
		 * 	this(ObjectType):目标对象的代理对象为ObjectType时，将匹配ObjectType类型的所有方法
		 * 	target(ObjectType):目标对象为ObjectType时，将匹配ObjectType类型的所有方法
		 * 
		 * args:捕捉指定类型参数、指定参数数量的方法，而不管其所在的类型
		 * 
		 * @within:指定某种类型的注解，只要对象标注了该注解，则内部的所有方法
		 * 
		 * @annotation：所有对象的所有方法级别
		 * 
		 */
	}
	
	
}
