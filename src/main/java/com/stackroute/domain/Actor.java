package com.stackroute.domain;


import org.springframework.beans.factory.annotation.Value;

public class Actor {

    private String name;
    private String gender;
    private int age;


    @Value("Harika")
    public void setName(String name) {
        this.name = name;
    }
    @Value("female")

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Value("12")

    public void setAge(int age) {
        this.age = age;
    }


    public void display(){

        System.out.println("actor details:" +name +"\n"+gender+"\n"+age);
    }



}
