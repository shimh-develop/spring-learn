package com.shimh.ioc.propertyeditor;

import org.springframework.beans.PropertyEditorRegistrySupport;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Info {
	/*
	 * 将在xml中配的转换成相应的类型  如：int
	 * 
	 * PropertyEditorRegistrySupport 提供了默认的属性编辑器
	 * 
	 * 自定义：
	 * 		1 实现PropertyEditorSupport
	 * 		2 在xml注册 CustomEditorConfigurer @see application.xml  Car CarEditor 则不用配置
	 * 
	 */
	public static void main(String[] args) throws Exception {

		//PropertyEditorRegistrySupport
		
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
		
		Driver d = (Driver) ac.getBean("driver");
		
		System.out.println(d.getCar().getName());
	}
		
	
}
