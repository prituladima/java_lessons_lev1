package com.prituladima.lessons.lesson7;

import com.prituladima.lessons.lesson6.IArray;
import com.prituladima.lessons.lesson6.MutableArray;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

//Inheritance
public class BufferedArray extends MutableArray implements Iterable<Integer> {

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

    //Single use
    //Multiple objects
    //throw error
    @Override
    public Iterator<Integer> iterator() {
        return new BufferedArrayIterator(arr, length);
    }

    private static class BufferedArrayIterator implements Iterator<Integer> {

        int nextInd;
        int[] arr;
        int len;

        public BufferedArrayIterator(int[] arr, int len) {
            this.arr = arr;
            this.len = len;
            this.nextInd = 0;
        }

        @Override
        public boolean hasNext() {
            return nextInd != len;
        }

        @Override
        public Integer next() {
            if (nextInd == len) {
                throw new NoSuchElementException("");
            } else {
                return arr[nextInd++];
            }
        }
    }



}
