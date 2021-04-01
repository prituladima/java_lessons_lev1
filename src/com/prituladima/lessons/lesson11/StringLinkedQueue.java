package com.prituladima.lessons.lesson11;

public class StringLinkedQueue implements IStringQueue {

    private static class Node {
        String val;
        Node prev;
        Node next;
    }

    Node head;
    Node tail;

    public StringLinkedQueue() {
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
    public void add(String val) {
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
    public String get() {
        return head.next.val;
    }

    @Override
    public String remove() {
        String ans = get();

        head.next = head.next.next;
        head.next.prev = head;

        len--;
        return ans;
    }
}
