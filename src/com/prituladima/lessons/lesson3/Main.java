package com.prituladima.lessons.lesson3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        int[] arr = {1, 3, 5, 6};
//
//        System.out.println(Arrays.toString(arr));

        int[][] mtx = {
                {1, 2, 3, 9},//i == 0
                {4, 5, 6, 7},//i == 1
                {4, 5, 4, 9},//i == 2
        };

        for (int i = 0; i < mtx.length; i++) {
            //Print i inner array
            for (int j = 0; j < mtx[i].length; j++) {
                System.out.print(mtx[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }

        System.out.println();


        for (int i = mtx.length - 1; i >= 0; i--) {
            //Print i inner array
            for (int j = 0; j < mtx[i].length; j++) {
                System.out.print(mtx[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println();
        for (int i = mtx.length - 1; i >= 0; i--) {
            //Print i inner array
            for (int j = mtx[i].length - 1; j >= 0; j--) {
                System.out.print(mtx[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < mtx.length; i++) {
            //Print i inner array
            for (int j = mtx[i].length - 1; j >= 0; j--) {
                System.out.print(mtx[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }

        /**
         * 9 3 2 1
         * 7 6 5 4
         * 9 4 5 4
         */

        System.out.println();
        for(int j = 0; j < mtx[0].length ; j++){
            for (int i = 0; i < mtx.length; i++) {
                System.out.print(mtx[i][j] + " ");
            }
            System.out.println();
        }

        int[][] var_;
    }
}
