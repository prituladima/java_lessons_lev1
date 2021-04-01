package com.prituladima.lessons.lesson11;

public class LinkedQueue implements IQueue{

    private static class Node {
        int val;
        Node prev;
        Node next;
    }

    Node head;
    Node tail;

    public LinkedQueue() {
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    int len;

    @Override
    public int length() {
        return len;
    }

    @Override
    public boolean isEmpty() {
        return length() == 0;
    }

    @Override
    public void add(int val) {
        Node toAdd = new Node();
        toAdd.val = val;

//        if(isEmpty()){
//            tail.prev = toAdd;
//            head.next = toAdd;
//            toAdd.next = tail;
//            toAdd.prev = head;
//        } else {
            Node last = tail.prev;//head
            tail.prev = toAdd;
            last.next = toAdd;
            toAdd.next = tail;
            toAdd.prev = last;
//        }


        len++;
    }

    @Override
    public int get() {
        return head.next.val;
    }

    @Override
    public int remove() {
        int ans = get();

        head.next = head.next.next;
        head.next.prev = head;

        len--;
        return ans;
    }
}
