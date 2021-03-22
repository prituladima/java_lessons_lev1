package com.prituladima.lessons.lesson2;

public class Main1 {

    public static void main(String[] args) {

        //[0, 1, 3, 7, 15, Integer.MAX_VALUE]

//
//        System.out.println(Integer.toBinaryString(1024 - 1));
//
//        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));


        //0
        //1
        //10 -> 11
        //100 -> 111 (1 + 10 + 100) (1000 - 1)


        for (int i = 0; i < 32; i++) {
            System.out.println((1 << i) - 1);
            System.out.println(Integer.toBinaryString((1 << i) - 1));
        }


    }
}
