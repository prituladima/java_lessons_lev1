package com.prituladima.lessons.lesson14.lesson;

import com.prituladima.lessons.lesson12.BinarySearchTree;
import com.prituladima.lessons.lesson12.IStringSet;
import com.prituladima.lessons.lesson13.lecture.HashTable;
import com.prituladima.lessons.lesson7.BufferedArray;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    private static int AMERICANO = 1;
    private static int ESPRESSO = 1 << 1;
    private static int LATE = 1 << 2;         //00000000100
    private static int FILTER_COFFEE = 1 << 3;//00000001000
    private static int ALL_TYPES = AMERICANO | ESPRESSO | LATE | FILTER_COFFEE;
    private static int NO_MILK = AMERICANO | ESPRESSO | FILTER_COFFEE;

    public static void main(String[] args) {

        //BufferedArray -> IArray
        //IArray __ = new BufferedArray();
        List<Integer> listInt = new ArrayList<>();
        List<String> listStr = new ArrayList<>();
        listStr.add("jdjd");
        listStr.add("jdjdfdlkndf");

        //IArray __ = new ImmutableArray();
        List<String> listIm = new CopyOnWriteArrayList<>();
        //IArray __ = new MutableArray();
        int[] array;

        //IString -> MutableString
        CharSequence stringBuilder = new StringBuilder("Hello Java");
        //IString -> ImmutableString
        CharSequence str = "Hello Kotlin";

        //int set
        //ImmutableSet
        int set;
        int bitMask;

        makeCoffee(AMERICANO | ESPRESSO | FILTER_COFFEE);
        makeCoffee(NO_MILK);

        makeCoffee(LATE);

        makeCoffee(ALL_TYPES);


        makeCoffee(EnumSet.allOf(CoffeeFlavor.class));
        makeCoffee(EnumSet.of(CoffeeFlavor.AMERICANO, CoffeeFlavor.ESPRESSO));

        //DynamicSet - MutableSet
        BitSet bitSet = new BitSet();


//        Stack<String> stack = new Stack<>();
        //Stack or Queue -> Deque
        Deque<Integer> deque = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        //interface segregation (OOP solId)


        //ISet int string
        //HashTable
        Set<String> hashTable = new HashSet<>();
        //BinarySearchTree - not balanced
        Set<String> tree = new TreeSet<>();//Red Black Tree
        tree.add("jdjd");
        tree.add("jdjdfdlkndf");

        NavigableSet<String> treeDictionary = new TreeSet<>();
        SortedSet<String> dataRange = treeDictionary.subSet("п", "р");

        //common
        //int size()
        //void add(T val)
        //String toString()

        for(int i = 0 ; i < listStr.size() ; i++) {
            System.out.println(listStr.get(i));
        }

        for (String s : listStr) {
            System.out.println(s);
        }

//        for (int i = 0; i < tree.size(); i++) {
//            System.out.println(tree.get(i));
//        }

        for (String s : tree) {
            System.out.println(s);
        }

        IStringSet ourTree = new BinarySearchTree();
        ourTree.add("jdjd");
        ourTree.add("jdjdfdlkndf");

//        for (String s : ourTree) {
//            System.out.println(s);
//        }

        Iterable<String> iterable = new TreeSet<>();
        for(String cur : iterable){
            System.out.println(cur);
        }

        Set<String> setIterable = new HashSet<>();
//        for (String s : setIterable) {
//            System.out.println(s);
//        }
        Iterator<String> iterator = setIterable.iterator();
//        Iterator<String> iterator = null;
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
        //iterator.hasNext() == false
//        System.out.println(iterator.next());
        //case 1. exception
        //case 2. return null or ""
        //case 3. tread blocking

//        Iterator<String> scanner = new Scanner(System.in);
//
//        for(int i = 0 ; i < 10 ; i ++) {
//            String next = scanner.next();
//            System.out.println(next);
//        }


        System.out.println("--- BufferedArray ---");
        BufferedArray bufferedArray = new BufferedArray(16);
        bufferedArray.add(5);
        bufferedArray.add(5);
        bufferedArray.add(7);
        bufferedArray.add(9);
        for (Integer cur : bufferedArray) {
            System.out.println(cur);
        }

        System.out.println("--- HashTable ---");
        HashTable hashTable1 = new HashTable();
        hashTable1.add("sdkjbf");
        hashTable1.add("sdkjsdfgbf");
        hashTable1.add("sdkjdsfbf");//sdkjdsfbf
        hashTable1.add("sdkjbdf");
        hashTable1.add("sdkjbdsdfdsf");

        for (String cur : hashTable1) {
            System.out.println(cur);
        }

        //diff
        //Random access -> arr[ind] = 5; (RAM) O(1)
        //Invariant - Condition
        //pre_invariant - ArrayList - grow if need -> add
        //post_invariant - TreeSet - add -> balance






    }

    //set
    private static void makeCoffee(int coffeeFlavors/*set*/) {
        System.out.println(Integer.toBinaryString(coffeeFlavors));
    }

    private static void makeCoffee(Set<CoffeeFlavor> coffeeFlavors/*set*/) {
        System.out.println(coffeeFlavors);
    }

    //class
    //interface
    //enum enumeration

    enum CoffeeFlavor {
        AMERICANO,
        ESPRESSO,
        LATE,
        FILTER_COFFEE
    }


}
