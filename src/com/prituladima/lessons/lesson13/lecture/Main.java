package com.prituladima.lessons.lesson13.lecture;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //Array semi-interval [2, 5) -> 3 len
        //ISet sorted  range(азбука, река) -> len ?
        //Tree - BinaryTree - Balanced Tree
        //log(n)

        //ISet
        //O(1*)
        //HashTable

        //normal distribution
        //uniform distribution !

        //HashTable
        //cap = 16;
        //
        //Node
        //String val;
        //Node next;

        //Equals && HashCode

        String str1 = "Hello java";
        String str2 = "Hello java1";
        System.out.println(str1.hashCode());

        System.out.println(str2.hashCode());
//        System.out.println(str2.hashCode());
////        System.out.println(str2.hashCode());
////        System.out.println(str2.hashCode());
////        System.out.println(str2.hashCode());

        //hash used with Immutable only


//        new Random().nextInt()??
        //int [-2^31, 2^31) ???


        //String -> int hashCode -> int index
//        int hashCode = 388370640;
        int hashCode = -845411999;
        int cap = 16;
        System.out.println("ind = " + (hashCode % cap + cap) % cap);

        for (int i = 0 ; i < 20 ;i ++){

            String val = UUID.randomUUID().toString();
            System.out.println(val);

            System.out.println("ind = " + (val.hashCode() % cap + cap) % cap);

        }

        int hashCode1 = -845411999;
        int hashCode2 = 145437399;
        int capOld = 40;
        int capNew = 60;

        //Set ->

        //String -> int
        //int -> string

        //"slkjfvkjbsklbjdfjkbfdjkbdf"
        //char -> int
        //char -> int[]

        //Map отображение
        //Object -> count (int) MultiSet

//        Scanner scanner = new Scanner(new File("Red Dog by Louis De Bernieres.txt"));
//        IMap mapperWordToCount = new HashTable();
//        while (scanner.hasNext()){
//            mapperWordToCount.add(scanner.next());
//        }
        IMap mapperWordToCount = new HashTable();


        mapperWordToCount.add("abc");
        mapperWordToCount.add("abc");
        mapperWordToCount.add("abc");
        mapperWordToCount.add("abc");

        mapperWordToCount.add("abcd");
        mapperWordToCount.add("abcd");
        mapperWordToCount.add("abcd");
//        mapperWordToCount.remove("abcd");

        mapperWordToCount.add("sdjbjkdfbkd");
        mapperWordToCount.add("dsjhkbd");
        mapperWordToCount.add("dsfdf");
        mapperWordToCount.add("gerg");
        mapperWordToCount.add("sdjbjbrteskdfbkd");

        System.out.println(mapperWordToCount);
        System.out.println(mapperWordToCount.size());//7



        //5
        //[0, 1, 2, 3, 4] permutation
        //[1, 2, 0, 4, 3] permutation


        //HashTable toString() - HashMap
        //      Ordered - LinkedHashMap


//hjbjhbjh    jhvhjvjhv hjvhjv\n jhvhj    ghvhgcgh \n\n\n ghvhgc



    }
}
