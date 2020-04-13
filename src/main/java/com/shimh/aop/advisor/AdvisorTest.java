package com.shimh.aop.advisor;

import com.shimh.aop.PeopleBeforeAdvice;
import com.shimh.aop.Student;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import org.springframework.aop.aspectj.AspectJPointcutAdvisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.*;

import java.lang.reflect.Method;

/**
 * @author: shimh
 * @create: 2020年04月
 **/
public class AdvisorTest {

    public static void main(String[] args) {

        /**
         * Advisor
         *  PointcutAdvisor
         *      AbstractPointcutAdvisor
         *          DefaultPointcutAdvisor 包含pointcut和advice
         *          NameMatchMethodPointcutAdvisor 按方法名定义切点
         *          RegexpMethodPointcutAdvisor 正则表达式匹配
         *          StaticMethodMatcherPointcutAdvisor 静态方法匹配
         *          AspectJPointcutAdvisor Aspectj语法
         *          AspectJExpressionPointcutAdvisor Aspectj切点表达式
         *  IntroductionAdvisor 引介切面
         *
         *
         *
         */


        //Advisor
        //PointcutAdvisor
        //IntroductionAdvisor
        // AbstractPointcutAdvisor
        DefaultPointcutAdvisor defaultPointcutAdvisor;
        NameMatchMethodPointcutAdvisor nameMatchMethodPointcutAdvisor;
        RegexpMethodPointcutAdvisor regexpMethodPointcutAdvisor;
        StaticMethodMatcherPointcutAdvisor staticMethodMatcherPointcutAdvisor;
        AspectJPointcutAdvisor aspectJPointcutAdvisor;
        AspectJExpressionPointcutAdvisor aspectJExpressionPointcutAdvisor;
        StaticMethodMatcherPointcutAdvisorTest();
    }

    public static void StaticMethodMatcherPointcutAdvisorTest() {
        StaticMethodMatcherPointcutAdvisor staticMethodMatcherPointcutAdvisor = new StaticMethodMatcherPointcutAdvisor(){
            @Override
            public boolean matches(Method method, Class<?> aClass) {
                return method.getName().equals("say");
            }

            @Override
            public ClassFilter getClassFilter() {
                return new ClassFilter() {
                    @Override
                    public boolean matches(Class<?> aClass) {
                        return aClass.isAssignableFrom(Student.class);
                    }
                };
            }
        };

        staticMethodMatcherPointcutAdvisor.setAdvice(new PeopleBeforeAdvice());
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new Student());
        proxyFactory.addAdvisor(staticMethodMatcherPointcutAdvisor);

        Student s = (Student)proxyFactory.getProxy();
        s.say();

    }

}
