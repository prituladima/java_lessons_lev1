package com.prituladima.lessons.lesson20;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //1. Bubble sort
        //O(n^2) speed
        //O(n) memory + additional O(1) memory (in-place)

        //3 4 5 2 3 5 7 8 9 6 4 2
        //-> min ... max

        //iteration i [0, n)
        // iteration j [i, n)
        //min indMin
        // if(i != indMin) swap(i, indMin)

        //1: 2 4 5 2 3 5 7 8 9 6 4 3
        //10: .................... 8 9

        //O(n^2)

        //2. Insertion sort
        //O(n^2)
        //O(n) memory + additional O(1) memory (in-place)

        //iteration i [0, n)
        //int indToInsert = lowerBound[0, i)
        //int temp = arr[i]
        //move(indToInsert, i - 1, indToInsert + 1, i);
        //arr[indToInsert] = temp;


        //3.1
        //int[] arr = new int[2_000_000];
        //O(n * log(n))

        //String[] arrS = new String[1000];
        //loop O(n^2)
        //StringBuilder -> concat everything O(n)

        //O(n*log(n))
        //Queue<String> <- arrS

        //While(size queue > 1){
        //  queue.addLast(queue.removeFirst() + removeFirst());
        // }

        //sout(queue.removeFirst())

        //[1]
        //[5]
        //[1, 5]

        //[1, 3, 4]
        //[2, 4, 5, 7]
        //-> [1, 2, 3, 4, 4, 5, 7]
        //merge
//        int[] arr1 = new int[]{1, 3, 4};
//        int[] arr2 = new int[]{2, 4, 5, 7};
//        System.out.println(Arrays.toString(merge(arr1, arr2)));
        //merge sort (iterative version) O(n*log(n))
        //O(n) memory + additional O(n) memory (O(n*log(n)))
//
//        int[] arr = new int[]{2, 10000, 4, 5, 2, 3, 5, 7, 8, 9, 6, 4, 3};
//        mergeSort(arr);
//        System.out.println(Arrays.toString(arr));

        //merge sort (recursive version) O(n*log(n))
        //O(n) memory + additional O(n)


        //n = 27;
        //Merge sort O(n*log(n)) memory O(n*log(n))
        //Insertion sort O(n^2) memory O(1) in-place

        int[] arr = new int[]{2, 3, 1, 5, 7, 9, 8, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(toBinaryString(arr[i]) + " - " + arr[i]);
        }


        //4. Quick sort O(n*log(n)) O(n^2) in-place
        //arr = [2 4 5 2 3 5 7 8 9 6 4 3]
        //int last = 3
        //int[] left = [2 4 5 2 3 5 7 8 9 6 4 3].filter(el < 3)
        //int[] right = [2 4 5 2 3 5 7 8 9 6 4 3].filter(3 <= el)
        //arr = left + right
        //sort(arr, 0, left.len)
        //sort(arr, left.len, arr.len)
        //1. O(n*log(n))???
        //2. not in-place



        //[2 4 5 2 3 5 7 8 9 6 4 3]
        //[2 2] [4 5 3 5 7 8 9 6 4 3]
        //      [4 5 3 5 7 8 9 6 4 3]

        //[1 2 4 3  5 6 7 8 8 9 10]

        //in average O(n*log(n))* in-place
        //memory O(log(n))

        //O(n*log(n)) - 40ms <> O(n^2) - 1min

        //int p = pivot
        //sort(arr, 0, p)
        //sort(arr, p, arr.len)

    }

    //{2, 3, 1, 5, 7, 9, 8, 2, 3, 4, 5}

    //
    private static int pivot(int[] arr, int from, int upTo) {
        Random random = new Random();
        int randomInd = from + random.nextInt(upTo - from);//[from, upTo) ???[0, 10)
        swap(arr, upTo - 1, randomInd);

        //O(n) time
        //O(1) memory
        int last = arr[upTo - 1];
        //left arr[i] < last
        //right last <= arr[i]
        int j = from - 1;
        for(int i = from ; i < upTo - 1; i++){
            if(arr[i] < last){

                j++;
                if(j >= from) {
                    swap(arr, j, i);
                }
            }
        }
        // {ТЕ КТО МЕНЬШЕ, ОСТАЛЬНЫЕ, ПОСЛЕДНИЙ}
        swap(arr, j ++, upTo - 1);
        // {ТЕ КТО МЕНЬШЕ, ПОСЛЕДНИЙ, ОСТАЛЬНЫЕ}
        //return ПОСЛЕДНИЙ index
        return j;
    }

    private static void swap(int[] arr, int f, int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

    private static String toBinaryString(int numb) {
        return String.format("%8s", Integer.toBinaryString(numb)).replace(' ', '0');
    }

    private static void insertionSort(int[] arr, int from, int upTo) {
        ///
    }


    //2 4 5 2 3 5 7 8 9 6 4 3
    private static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length);
    }

    private static void mergeSort(int[] arr, int from, int upTo) {
        if (upTo - from > 1) {
            if (upTo - from > 27) {
                int mid = from + (upTo - from) / 2;
                mergeSort(arr, from, mid);
                mergeSort(arr, mid, upTo);
                merge(arr, from, mid, mid, upTo, from, upTo);
            } else {
                insertionSort(arr, from, upTo);
            }
        }
    }

    //
    private static void merge(int[] arr,
                              int from1, int upto1,
                              int from2, int upto2,
                              int from3, int upTo3) {
        if ((upto1 - from1) + (upto2 - from2) != (upTo3 - from3)) {
            throw new RuntimeException("Something wrong");
        }
        int[] res = new int[upTo3 - from3];

        int ind1 = from1;
        int ind2 = from2;
        int indRes = 0;
        while (ind1 < upto1 && ind2 < upto2) {
            if (arr[ind1] < arr[ind2]) {
                res[indRes++] = arr[ind1++];
            } else {
                res[indRes++] = arr[ind2++];
            }
        }

        while (ind1 < upto1) {
            res[indRes++] = arr[ind1++];
        }
        while (ind2 < upto2) {
            res[indRes++] = arr[ind2++];
        }

        //res = [0, upTo3 - from3)
        //arr = [from3, upTo3)
        if (upTo3 - from3 >= 0) {
            System.arraycopy(res, 0, arr, from3, upTo3 - from3);
        }


    }

    //main
    //mergeSort ??? n = 1_000_000
    //merge

    private static int[] merge(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];

        int ind1 = 0;
        int ind2 = 0;
        int indRes = 0;
        while (ind1 < arr1.length && ind2 < arr2.length) {
            if (arr1[ind1] < arr2[ind2]) {
                res[indRes++] = arr1[ind1++];
            } else {
                res[indRes++] = arr2[ind2++];
            }
        }

        while (ind1 < arr1.length) {
            res[indRes++] = arr1[ind1++];
        }
        while (ind2 < arr2.length) {
            res[indRes++] = arr2[ind2++];
        }

        return res;
    }

    //1 3 5 7 9
    //6 201 201

    //


}
