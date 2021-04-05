package com.prituladima.lessons.lesson12.solution;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        System.out.println("".compareTo("zzzzzzzzzzzzzzzzzzzzzzzzzz"));
        System.out.println("а".compareTo("я"));
        System.out.println("аааааа".compareTo("яяяяя"));

//        System.out.println("".compareTo("abc"));
//        System.out.println("".compareTo("abc"));

        ISortedSet set = new BinaryTree();

        set.add(5);
        set.add(5);
        set.add(10);
        set.add(6);
        set.add(7);
        set.add(7);
        set.add(8);

        set.add(200);
        set.add(-100);
        set.add(20);
        set.add(30);

        System.out.println(set.size());
        System.out.println(set);

        ISortedSet range = set.subSet(0, 20);
        System.out.println(range.size());
        System.out.println(range);

        int[] arr = {15, 16, 17, 18, 19,
                20, 21, 22, 23, 24};
        int[] perm = randomPermutation(10);
        System.out.println(Arrays.toString(perm));//[0, 1, ... 9]
        System.out.println(Arrays.toString(applyPermutation(arr, perm)));

    }

    static int[] applyPermutation(int[] arr, int[] perm) {
        if (arr.length != perm.length) {
            throw new RuntimeException("Lens must be equals!");
        }
        int len = arr.length;
        int[] newArr = new int[len];

        for (int i = 0; i < len; i++) {
            newArr[perm[i]] = arr[i];
        }

        return newArr;
    }

    static int[] randomPermutation(int len) {
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = i;
        }
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            int indexToSwapWith = Math.abs(random.nextInt() >> 1) % len;
            int temp = ans[indexToSwapWith];
            ans[indexToSwapWith] = ans[i];
            ans[i] = temp;
        }
        return ans;
    }

}
