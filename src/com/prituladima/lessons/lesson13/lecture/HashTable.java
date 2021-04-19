package com.prituladima.lessons.lesson13.lecture;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class HashTable implements IMap, Iterable<String> {

    double loadFactor;
    int cap;
    int size;
    Node[] nodes;

    public HashTable() {
        loadFactor = 0.75;
        cap = 16;
        nodes = new Node[cap];
    }

    private static class Node {
        String key;
        int val;
        Node next;

//        Node prevAdded;
    }

    private int ind(String key) {
        return (key.hashCode() % cap + cap) % cap;
    }

    private boolean equals(String first, String second) {
        return first.equalsIgnoreCase(second);
    }

    private void ensureCapacity() {
        //cap = 16
        //11 (16 < 0.75 * 11)
        //

        if (size + 1 < loadFactor * cap) {
            int newCap = cap + cap / 2;
            //

        }
    }


    @Override
    public int get(String key) {
        //key = "good" -> 2_000
        //key -> hashCode
        //hashCode -> ind
        if (contains(key)) {
            Node curNode = nodes[ind(key)];

            while (curNode != null) {
                if (equals(curNode.key, key)) {
                    return curNode.val;
                }
                curNode = curNode.next;
            }
            throw new RuntimeException();
        }

        return 0;
    }


    @Override
    public boolean contains(String key) {
        Node curNode = nodes[ind(key)];
        while (curNode != null) {
            if (equals(curNode.key, key)) {
                return true;
            }
            curNode = curNode.next;
        }
        return false;
    }

    @Override
    public boolean put(String key, int val) {
        ensureCapacity();
        int ind = ind(key);

        if (contains(key)) {
            Node curNode = nodes[ind];
            while (curNode != null) {
                if (equals(curNode.key, key)) {
                    curNode.val = val;
                    return false;
                }
                curNode = curNode.next;
            }
            throw new RuntimeException();
        } else {
            Node toAdd = new Node();
            toAdd.key = key;
            toAdd.next = nodes[ind];
            nodes[ind] = toAdd;
            size++;
            return true;
        }

    }

    @Override
    public boolean remove(String key) {
        if (contains(key)) {
            int ind = ind(key);
            Node node = nodes[ind];
            if (node.next == null) {
                nodes[ind] = null;
                size--;
                return true;
            } else {
                //len >= 2

                Node prevNode = nodes[ind];
                Node curNode = prevNode.next;
                if (equals(prevNode.key, key)) {
                    nodes[ind] = curNode;
                    size--;
                    return true;
                }

                while (curNode.next != null) {
                    if (equals(curNode.key, key)) {
                        prevNode.next = curNode.next;
                        size--;
                        return true;
                    }
                }

            }
            throw new RuntimeException();
        }


        return false;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder();
        //{
        //for nodes
        //    col
        //        [key, value]
        //}
        ans.append("{\n");
        for (Node node : nodes) {

            Node curNode = node;
            while (curNode != null) {

                ans.append(
                        String.format("[key = %s, value = %d]\n",
                                curNode.key, curNode.val)
                );

                curNode = curNode.next;
            }

        }
        ans.append("}");


        return ans.toString();
    }


    @Override
    public Iterator<String> iterator() {
        return new HashTableIterator(nodes);
    }

    //does not support null
    private static class HashTableIterator implements Iterator<String> {

        Node[] nodes;

        int nextInd;
        Node cur;

        String nextValue;

        public HashTableIterator(Node[] nodes) {
            this.nodes = nodes;
            this.nextInd = 0;
            prepareNext();
        }

        private void prepareNext() {
            //todo find error here
            String oldValue = nextValue;
            while (Objects.equals(oldValue, nextValue) && nextInd < nodes.length) {

                if (nodes[nextInd] == null) {
                    nextInd++;
                } else /*if(nodes[nextInd] != null) */ {
                    cur = nodes[nextInd];
                    nextValue = cur.key;
                }

                if (cur != null && cur.next == null) {
                    nextInd++;
                }
            }


        }

        //Idempotency
        //1 side effect
        //2 ---
        @Override
        public boolean hasNext() {
            return nextValue != null;
        }

        @Override
        public String next() {
            if (this.hasNext()) {
                String val = nextValue;
                prepareNext();
                return val;
            } else {
                throw new NoSuchElementException();
            }

        }
    }


}
