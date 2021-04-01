package com.prituladima.lessons.lesson11;

public interface IStringQueue {

    int length();

    boolean isEmpty();

    //addLast
    void add(String val);//offer

    //getFirst
    String get();//pick

    //removeFirst
    String remove();//pop


}
