package com.stackroute.domain;




public class Actor {

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
