
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

public class Movie{
    //Movie “has a” Actor that can be initialized via the corresponding setter method


    Actor actor;

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


