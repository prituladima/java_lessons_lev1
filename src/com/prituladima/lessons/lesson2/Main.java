package com.prituladima.lessons.lesson2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //[0..n) n - 0
        //[10..n) n - 10
        //[200..2000)

        int n = 20;
        for (int i = 10; i < n; i++) { //< <= >=  ---- <
            System.out.println(i);
        }

        String test = "i_love_you";

        System.out.println(test);

        System.out.println(test.substring(0, 2)
                + test.substring(2, 5)
                + test.substring(5, test.length()));


        int[] arr = {1, 2, 3, 7, 2, 5};

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, 2)));

        System.out.println(

                test.substring(0, test.length() / 2)
                        + test.substring(test.length() / 2, test.length())

        );


        int from = 0;
        int upTo = n;
        System.out.println("Print method!!!");
        print(from, upTo);
    }

    private static void print(int from, int upTo) {
        for (int i = from; i < upTo; i++) {
            System.out.println(i);
        }
    }

    /**
     * @param offset
     * @param len
     */
    private void print1(int offset, int len) {

    }

}
