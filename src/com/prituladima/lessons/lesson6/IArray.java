package com.prituladima.lessons.lesson6;

public interface IArray {

    IArray set(int ind, int val);

    int get(int ind);

    IArray swap(int first, int second);

    IArray reverse(int from, int upTo);

}
