package com.shimh.aop.aspect;

import java.lang.annotation.Inherited;

/**
 * @author: shimh
 * @create: 2020年03月
 **/
public class AspectTarget{

    @LogAnnotation
    public void annotationTest() {
        System.out.println("AspectTarget.annotationTest()");
    }

    public void withinTest() {
        System.out.println("AspectTarget.withinTest()");
    }

    public final void finalTest() {
        System.out.println("final方法：AspectTarget.finalTest()");
    }

}
