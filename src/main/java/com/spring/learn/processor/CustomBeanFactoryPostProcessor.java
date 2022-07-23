package com.spring.learn.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		String[]  beanStrings = beanFactory.getBeanDefinitionNames();
		for (String beanName : beanStrings) {
			
			BeanDefinition bean = beanFactory.getBeanDefinition(beanName);
			
			System.out.println("==================================================\n\n");
			
			
			System.out.println(bean);
			
			
			System.out.println("==================================================\n\n");
			
		}
		
	}

}
