package com.prituladima.lessons.lesson11;

public interface IStack {

    int length();

    boolean isEmpty();

    //addFirst
    void add(int val);//push

    //getFirst
    int get();//pick

    //removeFirst
    int remove();//pop

}
