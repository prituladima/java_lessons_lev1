package com.prituladima.lessons.lesson13.solution;

public class HashTable implements IMap {

    double loadFactor;
    int cap;
    int size;
    Node[] nodes;

    public HashTable() {
        cap = 16;
        loadFactor = .75;
        nodes = new Node[cap];
    }

    private static class Node {
        String key;
        int val;
        Node next;
    }

    private void ensureCapacity() {
        if (cap < loadFactor * size) {
            int oldCap = cap;
            int newCap = cap + cap / 2;
            Node[] newNodes = new Node[newCap];

            for (int i = 0; i < oldCap; i++) {

                Node curNode = nodes[i];
                while (curNode != null) {

                    final String key = curNode.key;
                    final int val = curNode.val;

                    int ind = keyToIndex(key);
                    Node newNode = new Node();
                    newNode.key = key;
                    newNode.val = val;
                    newNode.next = newNodes[ind];
                    newNodes[ind] = newNode;

                    curNode = curNode.next;
                }

            }

            cap = newCap;
            nodes = newNodes;

        }
    }

    private int keyToIndex(String key) {
        int hash = key.hashCode();
        return (hash % cap + cap) % cap;
    }

    private boolean equals(String first, String second) {
        return first.equalsIgnoreCase(second);
    }

    @Override
    public boolean contains(String key) { //OK
        Node curNode = nodes[keyToIndex(key)];

        while (curNode != null) {
            if (equals(curNode.key, key)) {
                return true;
            }
            curNode = curNode.next;
        }

        return false;
    }

    @Override
    public int get(String key) {
        if (contains(key)) {
            int ind = keyToIndex(key);
            Node curNode = nodes[ind];

            while (curNode != null) {
                if (equals(curNode.key, key)) {
                    return curNode.val;
                }
                curNode = curNode.next;
            }
        }
        return -1;
    }

    @Override
    public boolean put(String key, int val) {
        ensureCapacity();

        int ind = keyToIndex(key);
        if (nodes[ind] == null) {
            nodes[ind] = new Node();
            nodes[ind].key = key;
            nodes[ind].val = val;
        } else {

            if (contains(key)) {
                Node curNode = nodes[ind];

                while (curNode != null) {
                    if (equals(curNode.key, key)) {
                        curNode.val = val;
                        return true;
                    }
                    curNode = curNode.next;
                }
            } else {
                Node curNode = nodes[ind];
                while (curNode.next != null) {
                    curNode = curNode.next;
                }
                curNode.next = new Node();
                curNode.next.key = key;
                curNode.next.val = val;
            }

        }
        size++;
        return true;

    }


    @Override
    public boolean delete(String key) {
        if (!contains(key)) {
            return false;
        } else {
            int ind = keyToIndex(key);
            Node prevNode;
            Node curNode = nodes[ind];
            if (equals(curNode.key, key)) {
                nodes[ind] = curNode.next;
                size--;
            } else {
                do {
                    prevNode = curNode;
                    curNode = curNode.next;
                } while (equals(curNode.key, key));
                prevNode.next = curNode.next;
            }
            return true;
        }
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("{\n");
        for (Node node : nodes) {

            Node curNode = node;
            while (curNode != null) {
                res.append(String.format("\t[%s -> %d]\n", curNode.key, curNode.val));
                curNode = curNode.next;
            }

        }
        res.append("}");
        return res.toString();
    }
}
