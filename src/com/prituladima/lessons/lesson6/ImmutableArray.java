package com.prituladima.lessons.lesson6;

import java.util.Arrays;

public class ImmutableArray implements IArray {

    int[] arr;//{0 0 0 0 0 0}
    int length;

    public ImmutableArray(int[] arr){
        this.arr = arr.clone();
        this.length = arr.length;
    }

    public ImmutableArray(int length) {
        this.length = length;
        this.arr = new int[length];
    }

    @Override
    public IArray add(int val) {
        ImmutableArray clone = new ImmutableArray(this.length + 1);

        for (int i = 0; i < length; i++) {
            clone.arr[i] = this.arr[i];
        }
        clone.arr[length] = val;
        return clone;
    }

    @Override
    public ImmutableArray set(int ind, int val) {
        ImmutableArray clone = new ImmutableArray(this.arr);
        clone.arr[ind] = val;
        return clone;
    }

    @Override
    public int get(int ind) {
        return arr[ind];
    }

    @Override
    public ImmutableArray swap(int first, int second) {
        ImmutableArray clone = new ImmutableArray(this.arr);
        int temp = clone.arr[first];
        clone.arr[first] = clone.arr[second];
        clone.arr[second] = temp;
        return clone;
    }

    @Override
    public ImmutableArray reverse(int from, int upTo) {
        ImmutableArray clone = new ImmutableArray(this.arr);
        for (int i = from, j = upTo; i < j; i++, j--) {
            //code reuse
            int temp = clone.arr[i];
            clone.arr[i] = clone.arr[j];
            clone.arr[j] = temp;
        }
        return clone;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
