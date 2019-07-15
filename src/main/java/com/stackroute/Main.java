package com.stackroute;

import com.stackroute.domain.Config;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Movie movie = context.getBean("movieA", Movie.class);
        movie.displayActor();



        Movie movie1 = context.getBean("movieB", Movie.class);
        movie1.displayActor();
        System.out.println(movie == movie1);


    }
}
