package com.shimh.ioc.beanfactory;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;

/**
 * @author: shimh
 * @create: 2020年04月
 **/
public class ApplicationContextTest {


    public static void main(String[] args) {


    }

    public void webApplicationContextUtilsTest() {
        //方式1. web应用中 从 ServletContext 获取 WebApplicationContext容器
        ServletContext servletContext = null;
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);

        //方式2.
        WebApplicationContext context2 = (WebApplicationContext)servletContext.getAttribute("WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE");


    }

}
