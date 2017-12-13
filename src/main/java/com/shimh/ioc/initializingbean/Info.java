package com.shimh.ioc.initializingbean;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;

import com.shimh.common.User;


/*
 * 	在对象实例化过程调用过“ BeanPostProcessor 的前置处理”之后，会接着检测当前对象是否实现了 InitializingBean 接口，
 * 	如果是，则会调用其 afterProper-tiesSet() 方法进一步调整对象实例的状态
 * 	
 * 	类似： init-method
 *
 */
public class Info {

	public static void main(String[] args) {

		//InitializingBean
	}
	
	
	
	
	
}
