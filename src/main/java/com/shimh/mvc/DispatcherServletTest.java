package com.shimh.mvc;

import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Set;

/**
 * @author: shimh
 * @create: 2020年04月
 **/
public class DispatcherServletTest {

    public static void main(String[] args) {

        // servlet3.0 方式配置
        ServletContainerInitializer servletContainerInitializer = new ServletContainerInitializer() {
            @Override
            public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
            }
        };

        // spring配置 SpringServletContainerInitializer
        WebApplicationInitializer webApplicationInitializer = new WebApplicationInitializer() {
            @Override
            public void onStartup(ServletContext servletContext) throws ServletException {

            }
        };

        //更方便的配置
        AbstractAnnotationConfigDispatcherServletInitializer a = new AbstractAnnotationConfigDispatcherServletInitializer() {
            @Override
            protected Class<?>[] getRootConfigClasses() {
                return new Class[0];
            }

            @Override
            protected Class<?>[] getServletConfigClasses() {
                return new Class[0];
            }

            @Override
            protected String[] getServletMappings() {
                return new String[0];
            }
        };

    }

}
