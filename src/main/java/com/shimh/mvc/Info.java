package com.shimh.mvc;

import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;
import org.springframework.web.servlet.view.AbstractCachingViewResolver;
import org.springframework.web.servlet.view.AbstractView;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;
import org.springframework.web.servlet.view.XmlViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;
import org.springframework.web.servlet.view.jasperreports.JasperReportsViewResolver;
import org.springframework.web.servlet.view.velocity.VelocityViewResolver;

/*
 * 		
 *  1 DispatcherServlet
 * 
 *  2 HandlerMapping  web请求和具体的处理类的映射关系匹配，多个时，按Ordered接口，值越小，优先级越高。
 *  	BeanNameUrlHandlerMapping url与bean的name匹配
 *  	SimpleUrlHandlerMapping 可以配置映射 mappings属性
 *  	DefaultAnnotationHandlerMapping 基于注解的配置
 *  
 *  4 HandlerAdapter
 *  	
 *  
 *  5 Controller 次级控制器，处理逻辑，返回 ModelAndView
 *  
 *  6 ModelAndView 模型数据和视图
 * 
 *  7 ViewResolver 按order属性查找
 *  
 *  	AbstractCachingViewResolver 实现了view实例的缓存功能：两个map来缓存view
 *  	单一视图：ViewResolver与 View 是一对一
 *  		InternalResourceViewResolver 如果没有ViewResolver，其将作为默认
 * 			FreeMarkerViewResolver/VelocityViewResolver
 * 			JasperReportsViewResolver
 *		多视图：
 *			ResourceBundleViewResolver 读取properties文件来配置映射关系，提供国际化支持
 *			XmlViewResolver xml文件配置
 *			BeanNameViewResolver 找同名的bean
 *  8 View 渲染数据
 * 		
 * ---------
 * 
 * 	HandlerInterceptor 可以在handlerMapping中配置
 * 
 * 	HandlerExceptionResolver
 * 
 * 
 * 
 *
 */
public class Info {

	public static void main(String[] args) {
		//DispatcherServlet
		//HandlerMapping
			//BeanNameUrlHandlerMapping
			//SimpleUrlHandlerMapping
			//DefaultAnnotationHandlerMapping
		
		//HandlerAdapter
			//AnnotationMethodHandlerAdapter
		
		//Controller
		//ModelAndView
		//ViewResolver
			//AbstractCachingViewResolver
				//InternalResourceViewResolver
				//FreeMarkerViewResolver
				//VelocityViewResolver
				//JasperReportsViewResolver
		
				//ResourceBundleViewResolver
				//XmlViewResolver
				//BeanNameViewResolver
		//View
			//AbstractView
		
		//HandlerInterceptor
		//HandlerExceptionResolver
			//SimpleMappingExceptionResolver
	}
	
	
	
	
	
}
