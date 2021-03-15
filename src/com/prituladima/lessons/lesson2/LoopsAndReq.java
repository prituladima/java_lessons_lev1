package com.prituladima.lessons.lesson2;

public class LoopsAndReq {
    public static void main(String[] args) {

        int[][] mtx = {
                {1, 2, 3},
                {4, 5, 6},
        };

        for (int i = 0; i < mtx.length; i++) {
            print_row(mtx[i], 0, mtx[i].length);
            System.out.println();
        }

    }

    private static void print_row(int[] row, int j, int length) {
        if (j < length) {
            System.out.print(row[j] + " ");
            print_row(row, j + 1, length);
        }
    }
}
