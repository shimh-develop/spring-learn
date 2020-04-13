package com.shimh.ioc.common;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

/**
 * @author: shimh
 * @create: 2020年01月
 **/
public class BeanPostProcessorTest implements BeanPostProcessor, Ordered {

    @Override
    public int getOrder() {
        return 0;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessorTest-BeforeInitialization: " + bean);

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessorTest-AfterInitialization: " + bean);

        return bean;
    }
}
