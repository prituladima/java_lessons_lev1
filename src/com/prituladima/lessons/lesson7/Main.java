package com.prituladima.lessons.lesson7;

import com.prituladima.lessons.lesson6.IArray;
import com.prituladima.lessons.lesson6.ImmutableArray;
import com.prituladima.lessons.lesson6.MutableArray;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        IArray array = new MutableArray(0);
        array.add(2);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(2);
        array.add(3);
        array.add(4);
        System.out.println(array);

        int[] arr = {1, 2, 3, 4, 5};
        IArray array1 = new ImmutableArray(arr);
        System.out.println(array1);
        IArray newlyCreatedArray = array1.add(6);
        System.out.println(array1);

        System.out.println(newlyCreatedArray);


        IArray buffArray = new BufferedArray(16);
        buffArray.add(2);
        buffArray.add(5);
        buffArray.add(6);
        buffArray.add(7);
        buffArray.add(2);
        buffArray.add(3);
        buffArray.add(4);
        buffArray.add(4);
        buffArray.add(4);
        buffArray.add(4);
        buffArray.add(4);
        buffArray.add(4);
        buffArray.add(4);
        buffArray.add(4);
        buffArray.add(4);
        buffArray.add(4);
        buffArray.add(4);
        buffArray.add(4);
        buffArray.add(4);
        buffArray.add(4);
        System.out.println(buffArray.getClass());
        System.out.println(buffArray);

        /////
        //MutableArray
        //add O(n)
        //set O(1) constant time
        //get O(1)
        //swap O(1)
        //reverse
        //  best case O(1)
        //  worst case O(n)

        //BufferedArray
        //add
        //  best case O(1) 99%
        //  average case (most) O(1*) amortized constant time
        //  worst case O(n) <1%

        //ImmutableArray
        //add O(n) linear time
        //set O(n)
        //get O(1)
        //swap O(n)
        //reverse O(n)


        //Random Access memory
        //         Heap
        //         Stack


        //Hard drive

        //ArrayList<Integer>
        //StringBuilder

        ////////////////////////////////
        ////////////////////////////////

        //MutableArray len
        //[]
        //[1]
        //[1, 2]
        //...
        //[ , , , , , , , , , ,]

        //BufferedArray len capacity strategyOfGrow
        //[ , , , , , , , , , ,  , ] 16
        //16 O(1)
        //[ , , , , , , , , , ,  ,  , , , , , , ] 24
        //1 O(n)
        //8 O(1)
        //[ , , , , , , , , , ,  ,  , , , , , , , , , , , ,,, , ,] 36
        //1 O(n)
        //12 O(1)

        //BufferedArray
        //add O(1) %
        //add O(n) %

        //16
        //add O(1) 100%
        //add O(n) 0%

        //17
        //add O(1) 93%
        //add O(n) 7%

        //1_000_000
        //add O(1) ???
        //add O(n) ???%

        int n = 1_000_000;

        int capacity = 16;

//        int cnt1 = 0;
        int cntN = 0;

        for (int i = 0; i < n; i++) {
            //len i
//            int len = i;
            int indexToPut = i;
            if (indexToPut == capacity) {
                capacity = strategyOfGrow(capacity);
                cntN++;
            }

        }

        System.out.println(cntN + " ---- " + (n - cntN));
        System.out.println(cntN * 1.0 / n * 100 + " %");

        //1. len = 0, capacity = 16
        //arr [0] = val
        //16. len = 15, capacity = 16
        //arr [15] = val
        //17. len == capacity

        ArrayList<Integer> list;
        StringBuilder sb;
        {
            int tests = 10000;
            long start = System.currentTimeMillis();

            BufferedArray bufferedArray = new BufferedArray(10);
            for (int i = 0; i < tests; i++) {
                bufferedArray.add(i);
            }

            long end = System.currentTimeMillis();
            System.out.println("BufferedArray " + (end - start));

        }

        {
            int tests = 10000;
            long start = System.currentTimeMillis();

            MutableArray mutableArray = new MutableArray(0);
            for (int i = 0; i < tests; i++) {
                mutableArray.add(i);
            }

            long end = System.currentTimeMillis();
            System.out.println("MutableArray " + (end - start));


        }

    }

    private static int strategyOfGrow(int oldCapacity) {
        //x1.5
        return oldCapacity + oldCapacity / 2;
    }

}
