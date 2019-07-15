package com.stackroute;

import com.stackroute.domain.Config;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {
        //Dependency Injection using Application Context
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Movie movie = context.getBean("movie", Movie.class);
        movie.displayActor();


    }
}





