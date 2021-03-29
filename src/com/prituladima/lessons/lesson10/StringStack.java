package com.prituladima.lessons.lesson10;

public class StringStack implements IStringStack{

    int nextInd;
    String[] arr;
    int cap = 16;

    public StringStack() {
        nextInd = 0;
        arr = new String[cap];
    }

    @Override
    public int length() {
        return nextInd;
    }

    private void ensureCap() {
        if (nextInd == cap) {
            cap += cap / 2; //*1.5
            String[] arrBigger = new String[cap];
            for (int i = 0; i < arr.length; i++) {
                arrBigger[i] = arr[i];
            }
            arr = arrBigger;
        }
    }

    @Override
    public void add(String val) {
        //if cap is not enough
        //grow
        ensureCap();
        //val == 77
        //nextInd = 0
        //arr[0] = val
        //nextInd++
        arr[nextInd++] = val;
    }

    @Override
    public String get() {
        return arr[nextInd - 1];
    }

    @Override
    public String remove() {
        return arr[--nextInd];
    }

    @Override
    public boolean isEmpty() {
//        return length() == 0 ? true : false;
        return length() == 0;
    }

}
