package com.prituladima.lessons.lesson6;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Person person = new Person(
                "AE012345",
                "Alberta",
                "Fidelino",
                new Date(),
                175,
                70.5
        );
        System.out.println(person);

//        MutableArray arr = new MutableArray(20);
        MutableArray arr = new MutableArray(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}
        );
        arr.set(0, 5);//arr[0] = 5;
        System.out.println(arr);

        int val = arr.get(0);//int val = arr[0];

        arr.swap(0, 3);//???
        System.out.println(arr);

        arr.reverse(5, 9);//???


        System.out.println(arr);

        arr.reverse(5, 9);//???
        System.out.println(arr);

        arr.reverse(0, arr.length - 1);//???
        System.out.println(arr);

        arr.reverse(3, 1);//???
        System.out.println(arr);

        String str = "hello Java";
        String res = str.replace('h', 'a');

        //Method chaining
        arr.swap(0, 2)
                .swap(2, 5)
                .swap(4, 7)
                .swap(4, 6)
                .swap(0, 3);

        StringBuilder sb = new StringBuilder("");

        sb.append("hello")
                .append(" ")
                .append("Java");


        IArray arr2 = new MutableArray(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}
        );

        System.out.println(arr2.set(0, 12));


//        System.out.println(arr.toString());

        print(2000);
        print("dsjkdfjbkd");


        String str2 = "aa";
        String str3 = new String(new char[]{'a', 'a'});

        int[][] mtx = {
                {1, 2, 3, 9},//i == 0
                {4, 5, 6, 7},//i == 1
                {4, 5, 4, 9},//i == 2
        };

//        for (int i = 0; i < mtx.length; i++) {
//            for (int j = 0; j < mtx[0].length; j++) {
//                System.out.println();
//            }
//        }

    }

    private static void print(int a){
        System.out.println(a);
    }

    private static void print(String a){
        System.out.println(a);
    }

}
