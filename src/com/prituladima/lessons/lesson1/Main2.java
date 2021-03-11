package com.prituladima.lessons.lesson1;

public class Main2 {

    public static void main(String[] args) {
        String test = "Привет группа номер 1";
        System.out.println(test);

        int[] arr = new int[0];
        print(0, 20, arr);


        print(0, 20, 1, 2, 3, 4);

        int[] arr2 = new int[]{1, 2, 3, 4};
        print(0, 20, arr2);

        int[] arr3 = {1, 2, 3, 4};
        print(0, 20, arr3);


    }

    private static void print(int from, int upTo, int... arr /*int[] arr*/) {

    }
}
