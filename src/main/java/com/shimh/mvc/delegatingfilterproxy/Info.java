package com.shimh.mvc.delegatingfilterproxy;

import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerInterceptor;
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
 * 	Filter 的声明周期由web容器管理，不能调用一些spring的服务，可以配置一个DelegatingFilterProxy
 * 	代理Filter，真正的Filter在spring.xml中配置
 * 		
 * 
 * 
 * 
 *
 */
public class Info {

	public static void main(String[] args) {
		//DelegatingFilterProxy

	}
	
	
	
	
	
}
