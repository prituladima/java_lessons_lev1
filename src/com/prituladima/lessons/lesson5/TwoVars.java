package com.prituladima.lessons.lesson5;

public class TwoVars {
    public static void main(String[] args){

        int a = 10;
        int b = 20;

        //(a, b) = (b, a)
        System.out.println(a + " - " + b);


        /////////


        String str1 = "hello 1";
        String str2 = "hello 2";

        System.out.println(str1 + " - " + str2);

        String temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println(str1 + " - " + str2);

        swap(str1, str2);

        System.out.println(str1 + " - " + str2);



        ///////////////////////////
        System.out.println("String builder!!!");
        StringBuilder stringBuilder1 = new StringBuilder("hello 1");
        StringBuilder stringBuilder2 = new StringBuilder("hello 2");

        System.out.println(stringBuilder1 + " - " + stringBuilder2);

        StringBuilder tempSB = stringBuilder1;
        stringBuilder1 = stringBuilder2;
        stringBuilder2 = tempSB;

        System.out.println(stringBuilder1 + " - " + stringBuilder2);

        swap(stringBuilder1, stringBuilder2);

        System.out.println(stringBuilder1 + " - " + stringBuilder2);

    }

    private static void swap(int[] arr1, int[] arr2) {

    }

    private static void swap(StringBuilder stringBuilder1, StringBuilder stringBuilder2) {
//        StringBuilder tempSB = stringBuilder1;
//        stringBuilder1 = stringBuilder2;
//        stringBuilder2 = tempSB;
//        System.out.println("inner output - " + stringBuilder1 + " - " + stringBuilder2);


        String temp = stringBuilder1.toString();
        stringBuilder1.setLength(0);
        stringBuilder1.append(stringBuilder2);

        stringBuilder2.setLength(0);
        stringBuilder2.append(temp);


        System.out.println("inner output - " + stringBuilder1 + " - " + stringBuilder2);

    }

    private static void swap(String left, String right){
        String temp = left;
        left = right;
        right = temp;

    }
}
