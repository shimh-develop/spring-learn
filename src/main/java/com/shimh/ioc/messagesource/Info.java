package com.shimh.ioc.messagesource;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;

/*
 * 	MessageSource 国际化支持    jdk@see LocaleAndResourceBundle 
 * 	
 *  ApplicationContext 将委派容器中一个名称为 messageSource 的 Message-Source 接口实现来完成 MessageSource 应该完成的职责。如果找不到这样一个名字的 MessageSource
		实现， ApplicationContext 内部会默认实例化一个不含任何内容的 StaticMessageSource 实例
		
	子类： StaticMessageSource
		ResourceBundleMessageSource
		
		ReloadableResourceBundleMessageSource  
			通过其cacheSeconds 属性可以指定时间段，以定期刷新并检查底层的properties资源文件是否有变更
 * 	
 *
 */
public class Info {

	public static void main(String[] args) {
		
		//独立使用
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasenames(new String[]{"messages"});
		System.out.println(messageSource.getMessage("say", new Object[]{"jams"}, Locale.US));
		
		
		
		//spring容器  注册的ResourceBundleMessageSource  可以将其注入到某个bean中使用
		ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		String message = ((MessageSource)ac).getMessage("say", new Object[]{"小明"}, Locale.getDefault());
		System.out.println(message);
		
	}
	
	
	
	
	
}
