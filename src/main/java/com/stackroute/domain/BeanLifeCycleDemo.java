package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


//BeanLifecycleDemoBean class that implements InitializingBean and DisposableBean.
public class BeanLifeCycleDemo implements InitializingBean, DisposableBean {

    public void customInit(){
        System.out.println("custom is initaized");

    }
    public void customDestroy(){
        System.out.println("custom is destroyed");

    }
    

//Override the required methods to print out messages.
    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
