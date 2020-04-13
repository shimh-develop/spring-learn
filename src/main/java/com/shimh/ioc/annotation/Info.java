package com.shimh.ioc.annotation;


/*
 * 	注解的自动装配
 * 	1 @Autowired  Filed 构造方法定义（Constructor） 方法定义（Method）
 * 		 需配置：AutowiredAnnotationBeanPostProcessor 实现，让这个 BeanPostProcessor 在实例化bean定义的
		    过程中，来检查当前对象是否有 @Autowired 标注的依赖需要注入
	2 @Qualifier 实际上是 byName 自动绑定的注解版
	
	3 JSR250的 @Resource   byName自动绑定形式的行为准则
	  @PostConstruct 和 @PreDestroy 不是服务于依赖注入的，它们主要用于标注对象生命周期管理相关方法，这与Spring的 InitializingBean 和 DisposableBean 接口，以及配置项中的
		init-method 和 destroy-method 起到类似的作用
		需配置：CommonAnnotationBeanPostProcessor 实现
 * 4 <context:component-scan> ：自动扫描@Component @Controller。。。 配置上面两个postprocessor
 * 
 *
 */
public class Info {

	public static void main(String[] args) {

		//InitializingBean
	}
	
	
	
	
	
}
