package com.prituladima.lessons.lesson5;

public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = b = a;


        print();
        //

        a++;

        System.out.println(b);

        modify(b);

        System.out.println(b);



        String str1 = "hello java!";
        String str2 = "hello cpp";

        String str3 = (str2 = str1);

        //String str1 = str1.replace('h', 'a');
        str1 = str1.replace('h', 'a');
        str1 = str1.substring(0, 5);

        System.out.println(str1);

        modify(str1);

        System.out.println("str1 = " + str1);

        System.out.println("-----StringBuilder-----");
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        StringBuilder stringBuilder3 = stringBuilder2 = stringBuilder1;

        stringBuilder1.append("hello");
        System.out.println(stringBuilder3);

        stringBuilder2.append(" python");

        System.out.println(stringBuilder3);

        modify(stringBuilder1);

        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);
        System.out.println(stringBuilder3);




    }

    private static void modify (StringBuilder toModify){
        toModify.append("!!!!");
        System.out.println("toModify = " + toModify);
    }

    private static void modify (String toModify){
        toModify += " kotlin";
        System.out.println("toModify = " + toModify);
    }

    private static void modify (int toModify){
        toModify += 40;
        System.out.println("toModify = " + toModify);
    }

    private static void print (){
        int d = 30;

        System.out.println(d);

    }

}
