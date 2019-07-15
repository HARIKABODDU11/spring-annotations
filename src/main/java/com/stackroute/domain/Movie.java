
package com.stackroute.domain;

import com.stackroute.domain.Actor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
@Qualifier("movie")

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {



    Actor actor;


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactory");

    }

    @Override
    public void setBeanName(String s) {
        System.out.println("BeanName");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext");

    }

    public Movie(Actor actor) {
        this.actor = actor;
    }


    public Movie(){

    }


    public void setActor(Actor actor)

    {
        this.actor = actor;
    }


    public void displayActor()
    {
        actor.display();
    }


}


