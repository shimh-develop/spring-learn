package com.shimh.aop.aspect;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 *
 * 为一个或多个 @AspectJ 方面建议的目标 object 创建代理
 *
 * @author: shimh
 * @create: 2020年03月
 **/
public class AspectJProxyFactoryTest {

    public static void main(String[] args) {
// create a factory that can generate a proxy for the given target object
        AspectJProxyFactory factory = new AspectJProxyFactory(new AspectTarget());

// add an aspect, the class must be an @AspectJ aspect
// you can call this as many times as you need with different aspects
        factory.addAspect(CommonAspect.class);

// you can also add existing aspect instances, the type of the object supplied must be an @AspectJ aspect
        //factory.addAspect(usageTracker);

// now get the proxy object...
        AspectTarget proxy = factory.getProxy();

        proxy.withinTest();
    }
}
