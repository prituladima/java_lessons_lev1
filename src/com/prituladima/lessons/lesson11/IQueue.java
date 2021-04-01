package com.prituladima.lessons.lesson11;

public interface IQueue {

    int length();

    boolean isEmpty();

    //addLast
    void add(int val);//offer

    //getFirst
    int get();//pick

    //removeFirst
    int remove();//pop

}
