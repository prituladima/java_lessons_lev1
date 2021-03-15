package com.prituladima.lessons.lesson6;

import java.util.Date;

public class Person {

    String id;
    String name;
    String secondName;
    Date dob;

    int height;
    double weight;

    public Person(){

    }
    public Person(String id, String name, String secondName, Date dob, int height, double weight) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.dob = dob;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", dob=" + dob +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
