package com.prituladima.lessons.lesson6;

import java.util.Arrays;


public class MutableArray /*extends Object*/ implements IArray /*Abstraction*/{

    public int[] arr;//{0 0 0 0 0 0}
    public int length;

    public MutableArray(int[] arr) {
        this.arr = arr.clone();
        this.length = arr.length;
    }

    public MutableArray(int length) {
        this.length = length;
        this.arr = new int[length];
    }

    @Override
    public IArray add(int val) {
        //old
        //[1, 2, 3] <- 4
        //new
        //[0, 0, 0, 0]
        //[1, 2, 3, 4]

        int[] newArr = new int[length + 1];
        for (int i = 0; i < length; i++) {
            newArr[i] = arr[i];
        }
        newArr[length] = val;
        arr = newArr;
        length++;
        return this;
    }

    @Override
    public MutableArray set(int ind, int val) {
        arr[ind] = val;
        return this;
    }

    @Override
    public int get(int ind) {
        return arr[ind];
    }

    @Override
    public MutableArray swap(int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return this;
    }

    //{1 3 4 .2 3 5 4. 5 6 3}
    //reverse(3, 6);
    //{1 3 4 .4 5 3 2. 5 6 3}

    //{1 3 4 .4 5 3 2 5. 6 3}
    @Override
    public MutableArray reverse(int from, int upTo) {
        for (int i = from, j = upTo; i < j; i++, j--) {
            //code reuse
            swap(i, j);
        }
        return this;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

}
