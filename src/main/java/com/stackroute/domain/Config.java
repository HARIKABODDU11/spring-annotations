package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.stackroute.domain")

public class Config {
    //bean creation for actor

    @Bean
    public Actor actor(){

        return new Actor("female","harika",21);

    }

    @Bean
    public Actor actor1(){

        return new Actor("female","hema",21);

    }
    @Bean
    public Actor actor2(){

        return new Actor("female","anushna",21);

    }
    //bean creation for movie


    @Bean
    public Movie movie(){
        Movie movie=new Movie();
        movie.setActor(actor());
        return movie;

    }
    @Bean
    public Movie movie1(){
        Movie movie1=new Movie();
        movie1.setActor(actor1());
        return movie1;

    }

}




