package com.spring.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Noted Packages to look into
 * org.springframework.web.servlet.DispatcherServlet; 
 * org.springframework.web.bind.annotation.ControllerAdvice; 
 * org.springframework.beans.factory.config.BeanFactoryPostProcessor; 
 * org.springframework.beans.factory.support.AbstractBeanFactory; 
 * org.springframework.context.ApplicationContext; 
 * org.springframework.beans.factory.BeanFactory;
 */

@SpringBootApplication
public class SpringLearnAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnAnnotationApplication.class, args);
	}

}
