package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.stackroute.domain")

public class Config {

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


    @Bean(name = {"movieA","movieB"})
    @Scope("prototype")

    public Movie movie(){
        Movie movie=new Movie();
        movie.setActor(actor());
        return movie;

    }

}




