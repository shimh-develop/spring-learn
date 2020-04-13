package com.shimh.ioc.common;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author: shimh
 * @create: 2020年01月
 **/
public class BeanLifecycleTest implements InitializingBean, DisposableBean {


    @PostConstruct
    public void test1() {
        System.out.println("BeanLifecycleTest: @PostConstruct注释");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanLifecycleTest: afterPropertiesSet()由InitializingBean回调接口定义");
    }

    public void test2() {
        System.out.println("BeanLifecycleTest: 自定义配置的init()方法");
    }

    @PreDestroy
    public void test3() {
        System.out.println("BeanLifecycleTest: @PreDestroy注释");
    }

    public void test4() {
        System.out.println("BeanLifecycleTest: 自定义配置的destroy()方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BeanLifecycleTest: destroy()由DisposableBean回调接口定义");
    }


}
