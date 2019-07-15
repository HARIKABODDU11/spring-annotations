package com.stackroute.domain;

import com.stackroute.domain.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("movie")


public class Movie {

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


