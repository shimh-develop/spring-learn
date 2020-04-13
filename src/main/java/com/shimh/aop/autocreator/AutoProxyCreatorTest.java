package com.shimh.aop.autocreator;

import com.shimh.aop.Student;
import com.shimh.aop.aspect.AspectTarget;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: shimh
 * @create: 2020年04月
 **/
public class AutoProxyCreatorTest {
    public static void main(String[] args) {

        /**
         *
         * BeanNameAutoProxyCreator 基于Bean配置命名规则
         * DefaultAdvisorAutoProxyCreator 对容器的所有advisor进行扫描
         * AnnotationAwareAspectJAutoProxyCreator 包含Aspectj注解的bean
         *
         */

        BeanNameAutoProxyCreator beanNameAutoProxyCreator;
        DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator;
        AnnotationAwareAspectJAutoProxyCreator annotationAwareAspectJAutoProxyCreator;
        BeanNameAutoProxyCreatorTest();
    }

    private static void BeanNameAutoProxyCreatorTest() {
        String location = "application-autocreator.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(location);
        Student target = context.getBean("student", Student.class);
        target.say();
    }
}
