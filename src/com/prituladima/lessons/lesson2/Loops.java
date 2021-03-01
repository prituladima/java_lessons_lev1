package com.prituladima.lessons.lesson2;

import java.util.Arrays;

public class Loops {

    public static void main(String[] args) {

        int n = 10;

        int[] arr = {1, 2, 3, 7, 2, 5};

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        for (int i = 0; i < n; i++) {
//            System.out.println(i);
//        }
//
//        System.out.println("----");
//
//        for (int i = n; i > 0; i--) {
//            System.out.println(i);
//        }


//        go1();

//        int i = n;
//        while (i < n){
//            System.out.println(i);
//            i++;
//        }
//
//
//        do {
//            System.out.println(i);
//        } while (i < n);

        print_(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

        for (int l = 0, r = arr.length - 1; l < r; l++, r--) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }

    private static void print_(int[] arr, int from, int upTo) {
        if (from < upTo) {
            print_(arr, from + 1, upTo);
            System.out.println(arr[from]);
//            print_(arr, from + 1, upTo);
        }
    }

    private static void go1() {

        go2();
    }

    private static void go2() {

        go3();

    }

    private static void go3() {

        System.out.println("go3");

    }


}
