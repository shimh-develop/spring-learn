package com.shimh.ioc.beanpostprocessor;

/*
 * 	 Bean-PostProcessor 是存在于对象实例化阶段	
 * 	    通常比较常见的使用 BeanPostProcessor 的场景，是处理标记接口实现类，或者为当前对象提供代理实现
 * 		 
 *				
 *	
 */
public class Info {

	public static void main(String[] args) {
		//BeanPostProcessor
		//ApplicationContextAwareProcessor  ApplicationContext 对应的那些 Aware 接口实际上就是通过 Bean-PostProcessor 的方式进行处理的
		//BeanNameAutoProxyCreator  Spring的AOP则更多地使用BeanPostProcessor 来为对象生成相应的代理对象
	}
	
	
	
	
	
}
