package com.shimh.ioc.propertyplaceholder;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class EncryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer{

	
	@Override
	protected String convertProperty(String propertyName, String propertyValue) {
		if("".equals(propertyName)){
			
			
			return encrypt(propertyValue);
		}
		
		return propertyValue;
	}

	//加密
	private String encrypt(String propertyValue) {

		
		return null;
	}
	
}
