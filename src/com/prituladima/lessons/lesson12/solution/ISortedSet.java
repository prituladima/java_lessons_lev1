package com.prituladima.lessons.lesson12.solution;

public interface ISortedSet extends ISet{

    ISortedSet subSet(int fromValue, int upToValue);

    int first();

    int last();
}
