package com.stackroute.domain;

public class Movie {



    public Movie(){

    }
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
