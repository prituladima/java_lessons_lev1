package com.prituladima.lessons.lesson11;

public class LinkedStack implements IStack {

    private static class Node {
        int val;
        Node next;
    }

    Node head;
    int len;

    public LinkedStack() {
        head = new Node();
    }

    @Override
    public int length() {
        return len;//O(1)
    }

    @Override
    public boolean isEmpty() {
        return length() == 0;//O(1)
    }

    @Override
    public void add(int val) { //O(1)
        Node toAdd = new Node();
        toAdd.val = val;

        if (!isEmpty()) {
            toAdd.next = head.next;
        }

        head.next = toAdd;
        len++;

    }

    @Override
    public int get() { //O(1)
        return head.next.val;
    }

    @Override
    public int remove() {//O(1)
        int ans = get();
        head.next = head.next.next;
        len--;
        return ans;
    }
}
