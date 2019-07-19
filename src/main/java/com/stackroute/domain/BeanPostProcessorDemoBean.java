package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
//BeanPostProcessorDemoBean class in com.stackroute.demo that implements BeanPostProcessor
public class BeanPostProcessorDemoBean implements BeanPostProcessor {
    
    //Override the required methods to print out messages

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("beforeInitialzation"+beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("afterIntialization"+beanName);
        return bean;
    }
}