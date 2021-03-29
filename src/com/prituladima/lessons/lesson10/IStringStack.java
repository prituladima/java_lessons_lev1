package com.prituladima.lessons.lesson10;

public interface IStringStack {

    int length();

    void add(String val);//push

    String get();//peek

    String remove();//pop

    boolean isEmpty();
}
