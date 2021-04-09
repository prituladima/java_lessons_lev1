package com.prituladima.lessons.lesson12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        int i = 0;
//
//        int j = i;
//
//        j = (1 << 10) + 1;
//        j = (j >>> 1) + 1;
//        j = (j >>> 1) + 1;
//        j = (j >>> 1) + 1;
//        j = (j >>> 1) + 1;
//        j = (j >>> 1) + 1;
//        j = (j >>> 1) + 1;
//        j = (j >>> 1) + 1;
//        j = (j >>> 1) + 1;
//
//        i += j;
//
//        System.out.println(i);

        int hash = Integer.MIN_VALUE;
        int len = 15;
        System.out.println((hash % len + len) % len);


        //1, 2, 2, 3
        //3
        //1, 2, 3 contains 3?

        //BitSet 1, 100_000
        //1.
        //System.out.println(100_000 / 32);

        //2. ["азбука", ...  "яблоко"]

        //3. Implementation
        //Naive
//        String[] arr = {"abc", "abc", "bb"};
//        IStringSet set; //new StringSet();
        //all operation O(n)
        //for( i = [0, 40_000])
        //    O(40_000)

        //"abc", "abc"
        //"abc", "ABC", "Abc"

        //case-sensitive
        //case-insensitive

        //4. binary search tree
        System.out.println(
                String.CASE_INSENSITIVE_ORDER.compare("abc", "zzzz")
        );

        System.out.println(
                "bBB".compareToIgnoreCase("bbb")
        );

        System.out.println(
                String.CASE_INSENSITIVE_ORDER.compare("zzzz", "abc")
        );

        System.out.println(
                String.CASE_INSENSITIVE_ORDER.compare("ab", "za")
        );

        IStringSet set = new BinarySearchTree();
        set.add("аббатство");
        set.add("абажур");
        set.add("абазинка");
        set.add("аббат");
        set.add("абака");
        set.add("");
        set.add("");
        set.add("");
        set.add("");
        System.out.println(set.len());
        System.out.println(set);
        /**
         * абажур
         * абаз
         * абазин
         * абазинка
         * абака
         * аббат
         * аббатиса
         * аббатисса
         * аббатство
         */


        //5. balancing
        if (false) {
            //O(n^2)

            Scanner scanner = new Scanner(new File("word_rus.txt"));
            IStringSet rusSetSlow = new BinarySearchTree();
            long start = System.currentTimeMillis();
            for (int i = 0; i < 34_010; i++) {
                rusSetSlow.add(scanner.nextLine());
            }
            long end = System.currentTimeMillis();
            System.out.println("Time = " + (end - start));

        }
        if (false) {
            //O(n * log (n))
            Scanner scanner = new Scanner(new File("word_rus.txt"));
            IStringSet rusSetSlow = new BinarySearchTree();

            String[] arr = new String[34_010];
            for (int i = 0; i < 34_010; i++) {
                arr[i] = scanner.nextLine();
            }

            shuffle(arr);

            long start = System.currentTimeMillis();
            for (int i = 0; i < 34_010; i++) {
                rusSetSlow.add(arr[i]);
            }
            long end = System.currentTimeMillis();
            System.out.println("Time = " + (end - start));
        }


    }

    private static void shuffle(String[] arr) {

        int length = arr.length;
        Random random = new Random();// [-2^31..2^31) -> [0..length)

        for (int i = 0; i < length; i++) {

            int r = Math.abs(random.nextInt() >> 1) % length;

            String temp = arr[i];
            arr[i] = arr[r];
            arr[r] = temp;


        }

    }


}
