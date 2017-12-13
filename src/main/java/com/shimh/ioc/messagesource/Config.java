package com.shimh.ioc.messagesource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class Config {
	
	@Bean
	public ResourceBundleMessageSource messageSource (){
		
		ResourceBundleMessageSource ms = new ResourceBundleMessageSource();
		ms.setBasenames(new String[]{"messages"});
		
		return ms;
		
	}
	
	
}
