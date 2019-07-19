package com.stackroute.domain;




public class Actor {
  //Actor has two String properties, name and gender, and an age property of type int
    private String gender;
    private  int age;
    private String name;


    public Actor(String gender,  String name,int age) {
        this.gender = gender;
        this.age = age;
        this.name = name;
    }





    public void display(){

        System.out.println("actor details:" +name +"\n"+gender+"\n"+age);
    }



}
