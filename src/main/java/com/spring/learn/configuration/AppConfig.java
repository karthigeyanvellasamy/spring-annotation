package com.spring.learn.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.learn.processor.CustomBeanFactoryPostProcessor;

@Configuration
@ComponentScan("com")
public class AppConfig {
	
	@Bean
	public CustomBeanFactoryPostProcessor beanFactoryPostProcessor() {
		return new CustomBeanFactoryPostProcessor();
	}

}
