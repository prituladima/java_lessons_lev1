package com.prituladima.lessons.lesson2;

public class ReqAndLoops {
    public static void main(String[] args) {
        int[][] mtx = {
                {1, 2, 3},
                {4, 5, 6},
        };

        print_matrix(mtx, 0, mtx.length);

    }

    private static void print_matrix(int[][] mtx, int i, int length) {
        if (i < length) {
            for (int j = 0; j < mtx[i].length; j++) {
                System.out.print(mtx[i][j] + " ");
            }
            System.out.println();
            print_matrix(mtx, i + 1, length);
        }
    }


}
