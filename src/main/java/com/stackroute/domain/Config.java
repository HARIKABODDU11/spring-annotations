package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.stackroute.domain")

public class Config {

    @Bean
    public Actor actor(){
        Actor actor=new Actor();

        return actor;
    }
    @Bean

    public Movie movie(){
        Movie movie=new Movie();
        movie.setActor(actor());
        return movie;

    }

}
