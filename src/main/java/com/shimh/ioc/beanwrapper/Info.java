package com.shimh.ioc.beanwrapper;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;

import com.shimh.ioc.common.User;


/*
 * 	对某个bean进行“包裹”，然后对这个“包裹”的bean进行操作，比如设置或者获取bean的相应属性值
 *
 */
public class Info {

	public static void main(String[] args) {
		User u = new User();
		BeanWrapper newsProvider = new BeanWrapperImpl(u);
		
		newsProvider.setPropertyValue("id", 1);
		
		newsProvider.setPropertyValue("hobbies", "shopping");
		newsProvider.setPropertyValue("hobbies[1]", "sleep");
		
		newsProvider.setPropertyValue(new PropertyValue("name","xiaoming"));
		
		//maps 属性为null一般会报错
		newsProvider.setPropertyValue("maps[a]","a");
		newsProvider.setPropertyValue("maps[b]","b");
		
		System.out.println((User)newsProvider.getWrappedInstance());
	}
	
	
	
	
	
}
