package com.stackroute.domain;

public class Movie {



    public Movie(){

    }
    //Movie “has a” Actor that can be initialized via the corresponding setter method.
    Actor actor;

    public void setActor(Actor actor)

    {
        this.actor = actor;
    }


    public void displayActor()
    {
        actor.display();
    }
}
