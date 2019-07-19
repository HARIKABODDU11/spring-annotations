package com.stackroute;

import com.stackroute.domain.Config;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


    public  static void main(String[]args){
        //intialize application  context with configuration class
        ApplicationContext context=new  AnnotationConfigApplicationContext(Config.class);
        Movie movie=context.getBean("movie",Movie.class);
        movie.displayActor();
        
        /initialize BeanFactory with configuration class
       BeanFactory beanFactory = new ConfigurableBeanFactory(new ClassPathResource(Config.class));
       Movie movie1 = beanFactory.getBean("movie",Movie.class);
       movie1.displayActorDetails();
       //initialize BeanFactory with configuration class
       DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
       BeanDefinitionRegistry beanDefinitionRegistry = new GenericApplicationContext(factory);
       BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
       reader.loadBeanDefinitions(Config.class);
    }
}
