package com.prituladima.lessons.lesson8;

//int
public interface ISet {

    //Set int len()
    int len();

    int get();

    boolean contains(int val);
    //Set void add(int val)
    boolean add(int val);

    //Set void remove(int val)
    boolean remove(int val);

    void removeAll();

    //String str2 = str1.concat("lala"); //Immutable
    //strBuilder.append("lala"); //Mutable
    //String concat(String str);

    ISet and(ISet val1);
    //Set1 and Set2  [4. 5]

    ISet or(ISet val1);
    //Set1 or Set2 [2, 3, 4, 5, 6, 7]

    ISet xor(ISet val1);
    //Set1 xor Set2 [2, 3, 6, 7]

}
