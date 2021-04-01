package com.prituladima.lessons.lesson11;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        //Stack
        //Single linked list
        //Pattern Composite
        //add(2)
        //add(5)
        //add(8)

        IStack stack = new LinkedStack();
        int[] arr = new int[]{1, 2, 3, 4, 5, 8, 9};
        for (int i = 0; i < arr.length; i++) {
            stack.add(arr[i]);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.remove() + " ");
        }

        System.out.println();

        //Queue [Qu]
        IQueue queue = new LinkedQueue();
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 8, 9};
        for (int i = 0; i < arr1.length; i++) {
            queue.add(arr1[i]);
        }
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }


        //Deque
        LinkedList list;
        //Task
        //Time measure

        System.out.println("Strings: ");

        String[] strings = new String[10000];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = UUID.randomUUID().toString();
        }
//        System.out.println(Arrays.toString(strings));

        //1.O(n^2)

        long start1 = System.currentTimeMillis();
        String ans = "";
        for (int i = 0; i < strings.length; i++) {
            ans += strings[i];
        }
        long end1 = System.currentTimeMillis();
        //System.out.println(ans);
        System.out.println(end1 - start1);

        //2. O(n * log (n)) MergeSort
        IStringQueue stringQueue = new StringLinkedQueue();
        for (int i = 0; i < strings.length; i++) {
            stringQueue.add(strings[i]);
        }
        long start2 = System.currentTimeMillis();
        while (stringQueue.length() > 1) {
            String first = stringQueue.remove();
            String second = stringQueue.remove();
            stringQueue.add(first + second);
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);
//        System.out.println(stringQueue.remove());

        //3. O(n)
        long start3 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(strings[i]);
        }
        long end3 = System.currentTimeMillis();
        //System.out.println(ans);
        System.out.println(end3 - start3);

    }


}
