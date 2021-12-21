package com.prituladima.lessons.lesson8;

import com.prituladima.lessons.lesson6.MutableArray;

import java.util.Arrays;

public class MutableSet implements ISet {

    int len;
    int val;

    public MutableSet() {
        val = 0;//00000000000000000000000000000000
        len = 0;
    }

    public MutableSet(int val) {
        this.val = val;
        this.len = Integer.bitCount(val);
    }

    public MutableSet(int[] arr) {
        //arr = {1, 2, 4, 4, 12, 17}
        char[] chars = new char[32];
        Arrays.fill(chars, '0');
        for (int i : arr) {
            chars[i] = '1';
        }

        String s = new StringBuilder(String.valueOf(chars)).reverse().toString();
        val = Integer.parseInt(s, 2);
        //00000000000000000000000000010110
        System.out.println("val = " + s);
        len = Integer.bitCount(val);
        System.out.println("len = " + len);
    }

    //0, 1, 2, .... 31, 32,
    //int val
    //int[] val = new int[2];
    //{00000000000000100001000000010110, 00000000000000000000000000000001}
    //



    @Override
    public int len() {
        return len;
    }

    @Override
    public int get() {
        return val;
    }

    @Override
    public boolean contains(int toCheck) {
        //Set1 this.val    val = ???? 00000000000000100001000000010110
        //Set2 len = 1  toCheck = 3   00000000000000000000000000001000   2^3  1 << toCheck
        //                            00000000000000000000000000000001   1 << 0
        //                            00000000000000000000000000000010   1 << 1
        //                            00000000000000000000000000000100   1 << 2
        //                            00000000000000000000000000001000   1 << 3
        //       val & (1 << toCheck) > 0

        //ensureCapacity(ind);
        //toCheck = 302;
        return (val & (1 << toCheck)) > 0;

        //int[] val;
        //toCheck = 32;
        //int ind = toCheck / 32;
        //toCheck = toCheck % 32;
        //return ind < val.len && (val[ind] & (1 << toCheck)) > 0;


        //new int [0]
        //0  -> 00000000000000000000000000000001
        //31 -> 10000000000000000000000000000001
        //32 -> 00000000000000000000000000000001 10000000000000000000000000000001
        //32 -> 32 / 32 -> 1 -> 32 % 32 -> 0
        //33 -> 33 / 32 -> 1 -> 33 % 32 -> 1
        //33 -> 00000000000000000000000000000011 10000000000000000000000000000001
        //105-> 105 / 32 -> 4 -> 105 % 32 -> 9
        //105-> 00000000000000000000001000000000 00000000000000000000000000000000 00000000000000000000000000000000 00000000000000000000000000000011 10000000000000000000000000000001
        //toString() -> [0, 31, 32, 33, 105]


    }

    @Override
    public boolean add(int toAdd) {
        if (contains(toAdd) || toAdd > 31) {
            return false;
        }

        //Set1 this.val    val = ???? 00000000000000100001000000010110
        //Set2 len = 1  toCheck = 3   00000000000000000000000000001000   2^3  1 << toCheck
        //res                         00000000000000100001000000011110
        val = val | (1 << toAdd);
        len = Integer.bitCount(val);
        return true;
    }

    @Override
    public boolean remove(int toRemove) {
        if (!contains(toRemove) || toRemove > 31) {
            return false;
        }
        //Set1 this.val    val = ???? 00000000000000100001000000010110
        //Set2 len = 1  toRemove = 2  00000000000000000000000000000100   2^3  1 << toCheck
        //res                         00000000000000100001000000010010

        val = val ^ (1 << toRemove);
        len = Integer.bitCount(val);
        return true;
    }

    @Override
    public void removeAll() {
        val = 0;
        len = 0;
    }

    @Override
    public ISet and(ISet set) {
        val = val & set.get();
        len = Integer.bitCount(val);
        return this;
    }

    @Override
    public ISet or(ISet set) {
        val = val | set.get();
        len = Integer.bitCount(val);
        return this;
    }

    @Override
    public ISet xor(ISet set) {
        val = val ^ set.get();
        len = Integer.bitCount(val);
        return this;
    }

    @Override
    public String toString() {

        return toBinaryString(val);

        //int ind = 5; 0 , 1, 2, 3, 4, 5
        //int bit = 2; 0, 1, 2 //1
        //int val = 5 * 32 + 2
        //int[] ans = new int[len];
        //
        //return Arrays.toString(ans);
        //[1, 2, 6, 66, 207]...
    }

    private static String toBinaryString(int numb) {
        return String.format("%32s", Integer.toBinaryString(numb)).replace(' ', '0');
    }
}
