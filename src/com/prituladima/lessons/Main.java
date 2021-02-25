package com.prituladima.lessons;

import java.util.Arrays;
import java.util.Date;

public class Main {

    static String text1 = "Hello World! How much does bitcoin cost today?";


    public static void main(String[] args) {

        String text;

        text = "Hello World!";

        System.out.println(text);

        //////////

//        String text1;
//
//        text1 = "Hello World! How much does bitcoin cost today?";

        System.out.println(text1);


        /////////


        go();

        System.out.println(text1);
        System.out.println(text1);
        System.out.println(text1);
        System.out.println(text1);
        System.out.println(text1);


        Date date = new Date();
        System.out.println(date);

        long c = 30;//64bit
        c = 0b0100101;//100000 + 100 + 1
        c = 0x80_00_00;


        System.out.println("___ " + c);


        int check = 0xFF;//16^2 0x100
        System.out.println(check);
        check /= 2;
        System.out.println(check);
        System.out.println(Integer.toHexString(check));


        int a = 1_024;//32bit
        int b = 10;

        System.out.println("A = " + a);
        System.out.println("A = " + toBinaryString(a));

        a = a * 2;
        a = a << 1;

        System.out.println("A = " + a);
        System.out.println("A = " + toBinaryString(a));

//00000000000000000000000000001111

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        boolean flag = false;//1bit


        int[] arr = {2, 4, 6, 7, -2, 3};

        System.out.println(Arrays.toString(arr));

        final int n = Integer.MAX_VALUE;
        for (int i = n, cnt = 0; i > 0; i >>= 1, cnt++) {
            System.out.println("Iter " + cnt + " = " + i);

        }

        double doub = 10.003;
        double doub1 = 100_000.003;
        double doub2 = 1e5 + .003;



    }

    private static String toBinaryString(int numb) {
        return String.format("%32s", Integer.toBinaryString(numb)).replace(' ', '0');
    }

    private static void go() {


        String text1;

        text1 = "Go";

        System.out.println(text1);

    }

}
