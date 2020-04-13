package com.shimh.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author: shimh
 * @create: 2020年04月
 **/
public class PeopleBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("PeopleBeforeAdvice 方法前置增强。。");
    }
}
