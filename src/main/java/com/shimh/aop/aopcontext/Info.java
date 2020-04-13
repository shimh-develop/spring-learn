package com.shimh.aop.aopcontext;

/*
 * 使用aop代理时，若目标对象内部自己调用自己的方法时，代理不起作用
 * 	解决方法：为目标对象公开代理对象  AopContext 需要设置exposeProxy：true
 * 
 */

public class Info {

	public static void main(String[] args) {
		
		//AopContext.currentProxy(); 获取代理对象
		
		
		
		

	}
	
}
