package com.prituladima.lessons.lesson18;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1. Binary search
        //2. Lower/Upper bound -> how many insert options we have?
        //3. Insertion sort

        //1. Binary search
        //Tree -> String ?
        //arr[1_000_000] -> contains val? -> ind?
        int[] arr = {1, 2, 5, 2, 1, 3};//O(n)
        int val = 12;
        System.out.println();

        //??? O(log(n))
        arr = new int[]{1, 2, 5, 6, 8, 8};//1 000 000 {8 ... 8}

        System.out.println(binarySearch(arr, 12));
        //expected for 12 = -1 -> 6
        System.out.println(binarySearch(arr, 2));
        //expected for 2 = 1 -> 1, 2
        System.out.println(binarySearch(arr, 0));
        //expected for 0 = -1 -> 0
        System.out.println(binarySearch(arr, 6));
        //expected for 6 = 3 ->
        System.out.println(binarySearch(arr, 8));
        //expected for 8 = 4, 5 'any'
        System.out.println(binarySearch(arr, 7));
        //expected for 7 = -1

        //2. Lower/Upper bound -> how many insert options we have?
        //8 -> leftmost, rightmost
        //how many 8 we have?

        System.out.println("lowerBound -- - - ");
        //
        //{1, 2, 5, 6, 8, 8}
        System.out.println(lowerBound(arr, 12));
        //expected for 12 = 6
        System.out.println(lowerBound(arr, 2));
        //expected for 2 = 1
        System.out.println(lowerBound(arr, 0));
        //expected for 0 = 0
        System.out.println(lowerBound(arr, 6));
        //expected for 6 = 3
        System.out.println(lowerBound(arr, 8));
        //expected for 8 = 4
        System.out.println(lowerBound(arr, 7));
        //expected for 7 = 4

        System.out.println("upperBound(arr, 8) - lowerBound(arr, 8) + 1");
        System.out.println(upperBound(arr, 8));//5
        System.out.println(lowerBound(arr, 8));//4

        System.out.println(upperBound(arr, 8) - lowerBound(arr, 8) + 1);


        System.out.println(upperBound(arr, 2) - lowerBound(arr, 2) + 1);
        System.out.println(upperBound(arr, 0) - lowerBound(arr, 0) + 1);
        System.out.println(upperBound(arr, 7) - lowerBound(arr, 7) + 1);


        //3. Insertion sort

        int[] arrToSort = {2, 3, 4, 7, 1, 2, 3, 4, 7};
        System.out.println(Arrays.toString(arrToSort));
        insertionSort(arrToSort);
        System.out.println(Arrays.toString(arrToSort));
    }

    //O(n  * (log (n) + n)) -> O(n^2)
    private static void insertionSort(int[] arr){
        int[] arrClone = arr.clone();

        //ans = {}
        //loop in arr
        //     lowerBound(ans, curVal) -> O(log(n))
        //     firstAppearance -> insert(int ind) -> O(n)
        //




    }


    private static int upperBound(int[] arr, int val) {
        if (val < arr[0]) {
            return -1;
        } else if (arr[arr.length - 1] <= val) {
            return arr.length - 1;
        } else {
            int from = 0;
            int upTo = arr.length - 1;
            while (upTo - from > 1) {
                int mid = from + (upTo - from) / 2;
                if (arr[mid] <= val) {
                    from = mid;
                } else {
                    upTo = mid;
                }
            }
            return from;
        }
    }

    //8 10 -> 10 - 8 = 2 (+1)

    //arr.len > 0
    //
    private static int lowerBound(int[] arr, int val) {
        if (val <= arr[0]) {
            return 0;
        } else if (arr[arr.length - 1] < val) {
            return arr.length;
        } else {
            //(0  arr.length - 1]
            int from = 0;
            int upTo = arr.length - 1;
            while (upTo - from > 1) {
                int mid = from + (upTo - from) / 2;
                if (val <= arr[mid]) {
                    upTo = mid;
                } else {
                    from = mid;
                }
            }
            return upTo;
        }
    }


    //Algo
    //arr.len > 0
    //3 -> 1
    //4 -> 1
    private static int binarySearch(int[] arr, int val) {
        return binarySearch(arr, 0, arr.length - 1, val);
    }

    //10 20 -> mid = 10 +  (20 - 10)/ 2 -> 15
    //10 10 -> 10
    private static int binarySearch(int[] arr, int from, int upTo, int val) {
        //Step 0.
        if (from > upTo) {
            return -1;
        }

        //Step 1. Lookup the middle

        int mid = from + (upTo - from) / 2;
        if (arr[mid] == val) {
            return mid;
        }
        //Step 2. binarySearch right
        else if (arr[mid] < val) {
            //[mid + 1 .. arr.length - 1]
            return binarySearch(arr, mid + 1, upTo, val);
        }
        //Step 3. binarySearch left
        else if (val < arr[mid]) {
            //[0 .. mid - 1]
            return binarySearch(arr, from, mid - 1, val);
        }

        return -1;
    }


}
