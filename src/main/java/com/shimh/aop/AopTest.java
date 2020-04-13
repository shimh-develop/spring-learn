package com.shimh.aop;

import com.shimh.aop.aspect.AspectTarget;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: shimh
 * @create: 2020年03月
 **/
public class AopTest {

    public static void main(String[] args) {
        //annotationTest();
        withinTest();


    }

    public static void annotationTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-aop.xml");
        AspectTarget target = context.getBean("aspectTarget", AspectTarget.class);
        target.annotationTest();
    }

    public static void withinTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-aop.xml");
        AspectTarget target = context.getBean("aspectTarget", AspectTarget.class);
        target.annotationTest();
        target.withinTest();
        target.finalTest();
    }
}
