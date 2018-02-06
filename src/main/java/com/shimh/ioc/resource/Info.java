package com.shimh.ioc.resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class Info {
	/*
	 * Resource 资源接口
	 * 
	 * ResourceLoader 根据标识加载相应的资源
	 * 
	 */

	public static void main(String[] args) throws Exception {
		//Resource
			//ClassPathResource
			//FileSystemResource
			//ServletContextResource
		
		resource();
		
		//ResourceLoader
			//ResourcePatternResolver
				//PathMatchingResourcePatternResolver
		load();
	}
		
	public static void resource() throws Exception{
		ClassPathResource cp = new ClassPathResource("resource-test.txt");
		print(cp.getInputStream());
		
	}
	
	public static void load() throws Exception{
		//支持 ? * ** Ant格式
		String path = "classpath*:*.properties";
		ResourcePatternResolver rl = new PathMatchingResourcePatternResolver();
		
		Resource[] rs = rl.getResources(path);
		for(Resource r:rs){
			System.out.println(r.getFilename());
		}
	}
	
	
	public static void print(InputStream is) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String s = br.readLine();
		while(null != s){
			System.out.println(s);
			s = br.readLine();
		}	
	}
	
	
	
	
	
	
	
	
}
