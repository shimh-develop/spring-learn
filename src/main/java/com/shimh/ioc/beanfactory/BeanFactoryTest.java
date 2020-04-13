package com.shimh.ioc.beanfactory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * @author: shimh
 * @create: 2020年04月
 **/
public class BeanFactoryTest {

    public static void main(String[] args) {
        /**
         *
         * 构建 BeanFactory容器
         *
         */
        ResourceLoader resourceLoader = new PathMatchingResourcePatternResolver();
        Resource resource = resourceLoader.getResource("classpath:application.xml");

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions(resource);


        System.out.println(beanFactory.getBeanDefinitionNames());

    }


}
