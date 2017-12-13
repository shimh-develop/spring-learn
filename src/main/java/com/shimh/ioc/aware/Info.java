package com.shimh.ioc.aware;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;

import com.shimh.common.User;


/*
 * 	当对象实例化完成并且相关属性以及依赖设置完成之后，Spring容器会检查当前对象实例是否实现了一系列的以 Aware 命名结尾的接口定义
 *	
 *		1 BeanNameAware 
 *		2 BeanClassLoaderAware 会将 对应加载当前 bean的Classloader注入当前对象实例
 *		3 ApplicationContextAware
 *		4 MessageSourceAware  ApplicationContext 通过 Message-Source 接口提供国际化的信息支持
 *
 *	
 */
public class Info {

	public static void main(String[] args) {


	}
	
	
	
	
	
}
