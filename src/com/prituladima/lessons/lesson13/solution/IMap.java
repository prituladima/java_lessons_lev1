package com.prituladima.lessons.lesson13.solution;

public interface IMap {

    boolean isEmpty();

    int size();

    boolean contains(String key);

    int get(String key);

    boolean put(String key, int val);

    boolean delete(String key);


}
