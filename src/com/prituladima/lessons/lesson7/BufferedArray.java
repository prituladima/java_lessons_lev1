package com.prituladima.lessons.lesson7;

import com.prituladima.lessons.lesson6.IArray;
import com.prituladima.lessons.lesson6.MutableArray;

import java.util.Arrays;

//Inheritance
public class BufferedArray extends MutableArray {

    int capacity;
    int length;
    int[] arr;

    public BufferedArray(int[] arr) {
        super(arr);
        //arr = 3
        //arr = 200
        capacity = 16;
        capacity = Integer.max(arr.length, capacity);
        this.arr = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = arr[i];
        }
        this.length = arr.length;
    }

    public BufferedArray(int capacity) {
        super(capacity);
        this.arr = new int[capacity];
        this.capacity = capacity;
        this.length = 0;
    }

    @Override
    public IArray add(int val) {

        //if capacity not enough
        // grow

        //add

        if (length == capacity) {
            capacity = growUp(capacity);
            int[] newArray = new int[capacity];
            for (int i = 0; i < arr.length; i++) {
                newArray[i] = arr[i];
            }
            arr = newArray;
        }

        arr[length] = val;
        length++;


//        int[] newArr = new int[length + 1];
//        for (int i = 0; i < length; i++) {
//            newArr[i] = arr[i];
//        }
//        newArr[length] = val;
//        arr = newArr;
//        length++;
        return this;

    }

    private int growUp(int oldCapacity) {
        //x1.5
        return oldCapacity + oldCapacity / 2;
    }


    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(arr, length));
    }
}
