package com.shimh.ioc;

import com.shimh.ioc.common.Company;
import com.shimh.ioc.common.User;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author: shimh
 * @create: 2020年01月
 **/
public class ApplicationContextTest {

    private GenericApplicationContext context;

    public static void main(String[] args) {
        //createContainer();
        //createContainer2();
        //company();
        //lifecycleTest();
        //inheritedTest();
        beanPostProcessorTest();
    }

    public static void createContainer() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        User user = context.getBean("user6", User.class);
        System.out.println(user.getName());

    }

    public static void createContainer2() {
        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("application.xml");
        context.refresh();
        User user = context.getBean("user", User.class);
        System.out.println(user.getName());
    }

    public static void company() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Company company = context.getBean("company", Company.class);
        User user = company.getUser();
        System.out.println(user.getId());
        System.out.println(user.getId());
        System.out.println(user.getId());
        //System.out.println(company.getUser());

    }
    public static void lifecycleTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();

    }

    public static void inheritedTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        User user = context.getBean("user8", User.class);
        System.out.println(user.getName());

    }

    public static void beanPostProcessorTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.getName());

    }
}
