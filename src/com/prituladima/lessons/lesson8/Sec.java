package com.prituladima.lessons.lesson8;

import java.util.Scanner;

public class Sec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the %d: ", i);
            arr[i] = scanner.nextInt();
        }
        if (checkIfSortedAsc(arr)) {
            System.out.println("Sorted asc");
        } else if (checkIfSortedDec(arr)) {
            System.out.println("Sorted dec");
        } else {
            System.out.println("Not sorted");
        }

    }

    private static boolean checkIfSortedAsc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkIfSortedDec(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                return false;
            }
        }
        return true;
    }
}
