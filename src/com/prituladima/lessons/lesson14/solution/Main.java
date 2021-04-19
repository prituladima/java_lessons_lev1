package com.prituladima.lessons.lesson14.solution;

import java.net.CookieHandler;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) {

        //interfaces

        //IArray -> List (Random access)
        List<Integer> list1 = new ArrayList<>();//DynamicArray
        List<Integer> list2 = new CopyOnWriteArrayList<>();//ImmutableArray
        //No mutable array in Java
        List<Integer> list3 = new LinkedList<>();//Deque

        //IString -> CharSequence (chars)
        CharSequence charSequence1 = new StringBuilder("Example1");//MutableString
        CharSequence charSequence2 = new String("Example2");//ImmutableString

        //ISet -> Set
        int bitMask = 0b00000010101111;//Mutable set / immutable set

        BitSet bitSet = new BitSet();//DynamicSet or int[] bitMasks
        Set<String> set1 = new HashSet<>();//HashTable
        Set<String> set2 = new TreeSet<>();//BinaryTree (not balanced), RedBlackBinaryTree

        //IMap -> Map
        Map<String, Integer> map1 = new HashMap<>();//HashTable
        Map<String, Integer> map2 = new TreeMap<>();//BinaryTree (not balanced), RedBlackBinaryTree
        Map<String, Integer> map3 = new LinkedHashMap<>();//OrderedHashTable with accessOrder = false
        Map<String, Integer> map4 = new LRUCache<>(20);//OrderedHashTable with accessOrder = true

        //ISortedSet -> SortedSet/SortedMap, NavigableSet/NavigableMap
        SortedSet<String> sortedSet = new TreeSet<>();
        NavigableSet<String> navigableSet = new TreeSet<>();

        //IDeque -> Deque
        Deque<Integer> deque1 = new LinkedList<>();
        Deque<Integer> deque2 = new ArrayDeque<>();//out of course

        //IQueue -> Queue
        Queue<String> queue1 = new LinkedList<>();

        //IStack -> Stack
        Stack<String> stack1 = new Stack<>();//Deprecated
        Deque<String> dequeAsAStack = new LinkedList<>();

        //toString
        //


    }

    static Set<CoffeeFlavours> coffeeFlavoursSetNoMilk = EnumSet.of(
            CoffeeFlavours.ESPRESSO,
            CoffeeFlavours.AMERICANO,
            CoffeeFlavours.FILTER_COFFEE
    );

    enum CoffeeFlavours {
        ESPRESSO,
        AMERICANO,
        CAPPUCCINO,
        RAFF,
        FILTER_COFFEE
    }

    static class LRUCache<K,V> extends LinkedHashMap<K,V> {

        private final int maxCapacity;

        public LRUCache(int capacity) {
            super(capacity, .75F, true);
            this.maxCapacity = capacity;
        }

        @Override
        public V get(Object key) {
            return super.getOrDefault(key, null);
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
            return size() > maxCapacity;
        }
    }

}
