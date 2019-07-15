package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemo implements InitializingBean, DisposableBean {

    public void customInit(){
        System.out.println("custom is initaized");

    }
    public void customDestroy(){
        System.out.println("custom is destroyed");

    }


    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
