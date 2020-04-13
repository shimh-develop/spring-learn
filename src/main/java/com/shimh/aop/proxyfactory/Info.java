package com.shimh.aop.proxyfactory;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.interceptor.DebugInterceptor;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;

import com.shimh.ioc.common.User;

/*
 *  ProxyFactory 
 * 		独立于spring来生成代理对象
 *  AspectjProxyFactory
 *  	Aspectj注解生成代理对象
 * 
 * 	ProxyFactoryBean 
 * 		基于spring容器配置生成代理对象
 * 
 * 	自动代理
 * 		对象较多时，可以使用自动代理
 * 			BeanNameAutoProxyCreator
 * 			DefaultAdvisorAutoProxyCreator
 *
 */
public class Info {

	public static void main(String[] args) {
		
		User u = new User();
		
		ProxyFactory pf = new ProxyFactory(u);
		pf.setOptimize(true); //true 强制使用子类代理   
		pf.setProxyTargetClass(true); //true 子类代理   false 接口代理
		// pf.setInterfaces(); 若设置使用接口代理

		NameMatchMethodPointcutAdvisor advisor = new NameMatchMethodPointcutAdvisor();
		
		DebugInterceptor interceptor = new DebugInterceptor();
		
		advisor.setAdvice(interceptor);
		
		advisor.setMappedName("getName");
		
		pf.addAdvisor(advisor);
		
		
		User uproxy = (User) pf.getProxy();
		System.out.println(interceptor.getCount());
		System.out.println(uproxy.getName());
		System.out.println(interceptor.getCount());
		System.out.println(uproxy.getId());
		
		System.out.println(interceptor.getCount());
		
		
		System.out.println(pf.getProxy().getClass());
		
	}
	
	
	
	
	
}
