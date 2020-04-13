package com.shimh.mvc;

import org.springframework.http.ResponseEntity;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.web.client.AsyncRestTemplate;

import com.shimh.ioc.common.User;

/*	默认组件配置：/org/springframework/web/servlet/DispatcherServlet.properties
 * 		
 *  1 DispatcherServlet
 * 
 *  2 HandlerMapping 路由控制器  web请求和具体的处理类的映射关系匹配，多个时，按Ordered接口，值越小，优先级越高。
 *  	BeanNameUrlHandlerMapping url与bean的name匹配
 *  	SimpleUrlHandlerMapping 可以配置映射 mappings属性
 *  	DefaultAnnotationHandlerMapping 基于注解的配置
 *  
 *  4 HandlerAdapter
 *  	
 *  
 *  5 Controller 次级控制器，处理逻辑，返回 ModelAndView
 *  
 *  6 ModelAndView 模型数据和视图
 * 
 *  7 ViewResolver 按order属性查找
 *  
 *  	AbstractCachingViewResolver 实现了view实例的缓存功能：两个map来缓存view
 *  	单一视图：ViewResolver与 View 是一对一
 *  		InternalResourceViewResolver 如果没有ViewResolver，其将作为默认
 * 			FreeMarkerViewResolver/VelocityViewResolver
 * 			JasperReportsViewResolver
 *		多视图：
 *			ResourceBundleViewResolver 读取properties文件来配置映射关系，提供国际化支持
 *			XmlViewResolver xml文件配置
 *			BeanNameViewResolver 找同名的bean
 *  8 View 渲染数据
 * 		
 * ---------
 * 
 * 	HandlerInterceptor 可以在handlerMapping中配置
 * 
 * 	HandlerExceptionResolver
 * 		AnnotationMethodHandlerExceptionResolver 允许使用@ExceptionHandler
 * 
 * 
 *------------
 *	HttpMessageCovert
 *-------
 *	ConversionService 数据转换
 *	Formatter 数据格式化    @DateTimeFormat
 *	Validator 数据校验
 *-----------
 *	RestTemplate 客户端同步
 *	AsyncRestTemplate 客户端异步调用
 *------------
 *	RequestContextHolder  需配置 RequestContextListener
 *
 */
public class Info {

	public static void main(String[] args) {
		//DispatcherServlet
		//HandlerMapping
			//BeanNameUrlHandlerMapping
			//SimpleUrlHandlerMapping
			//DefaultAnnotationHandlerMapping
		
		//HandlerAdapter
			//AnnotationMethodHandlerAdapter
		
		//Controller
		//ModelAndView
		//ViewResolver
			//AbstractCachingViewResolver
				//InternalResourceViewResolver
				//FreeMarkerViewResolver
				//VelocityViewResolver
				//JasperReportsViewResolver
		
				//ResourceBundleViewResolver
				//XmlViewResolver
				//BeanNameViewResolver
		//View
			//AbstractView
		
		//HandlerInterceptor
		//HandlerExceptionResolver
			//SimpleMappingExceptionResolver
			//AnnotationMethodHandlerExceptionResolver
		
		
		//-------
		//HttpMessageConverter<T>
		
		//RestTemplate
		//AsyncRestTemplate
		
		//ConversionService
		//Formatter
		//Validator
		
		test1();
	}
	
	//AsyncRestTemplate 非阻塞
	private static void test1() {
		AsyncRestTemplate art = new AsyncRestTemplate();

		ListenableFuture<ResponseEntity<User>> f = art.getForEntity("http:localhost:8080/users/", User.class);
		
		f.addCallback(new ListenableFutureCallback<ResponseEntity<User>>() {

			@Override
			public void onSuccess(ResponseEntity<User> result) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onFailure(Throwable ex) {
				// TODO Auto-generated method stub
				
			}

		});
		
		
	}
	
	
	
	
	
}
