package com.prituladima.lessons.lesson12.solution;

public class BinaryTree implements ISortedSet {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    TreeNode root;
    int size;

    int from;
    int upTo;

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        toString(root, res);
        return res.toString();
    }

    private void toString(TreeNode node, StringBuilder output) {
        if (node != null) {
            toString(node.left, output);
            output.append(node.val).append(' ');
            toString(node.right, output);
        }
    }

    @Override
    public boolean contains(int val) {
        if (isEmpty()) {
            return false;
        } else {
            TreeNode cur = root;
            while (true) {
                int compare = Integer.compare(val, cur.val);
                if (compare == 0) {
                    //do nothing
                    return true;
                } else if (compare < 0) {
                    if (cur.left == null) {
                        return false;
                    } else {
                        cur = cur.left;
                    }
                } else /*if(0 < compare)*/ {
                    if (cur.right == null) {
                        return false;
                    } else {
                        cur = cur.right;
                    }
                }
            }

        }

    }

    @Override
    public boolean add(int val) {
        TreeNode toAdd = new TreeNode();
        toAdd.val = val;

        if (isEmpty()) {
            root = toAdd;
            size++;
            return true;
        } else {
            TreeNode cur = root;
            while (true) {
                int compare = Integer.compare(toAdd.val, cur.val);
                if (compare == 0) {
                    //do nothing
                    return false;
                } else if (compare < 0) {
                    if (cur.left == null) {
                        cur.left = toAdd;
                        size++;
                        return true;
                    } else {
                        cur = cur.left;
                    }
                } else /*if(0 < compare)*/ {
                    if (cur.right == null) {
                        cur.right = toAdd;
                        size++;
                        return true;
                    } else {
                        cur = cur.right;
                    }
                }
            }
        }
    }


    @Override
    public boolean remove(int val) {
        if (!contains(val)) {
            return false;
        } else {
            root = remove(root, val);
            size--;
            return true;
        }
    }

    private TreeNode remove(TreeNode node, int val) {
        int compare = Integer.compare(val, node.val);
        if (compare == 0) {
            int first = first(node);
            remove(node, first);
            TreeNode newNode = new TreeNode();
            newNode.val = first;
            newNode.right = node;
            return newNode;
        } else if (compare < 0) {
            node.left = remove(node.left, val);
            return node;
        } else /*if (0 < compare)*/ {
            node.right = remove(node.right, val);
            return node;
        }

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
    public BinaryTree subSet(int fromValue, int upToValue) {

        //???

        return this;
    }

    @Override
    public int first() {
        return first(root);
    }

    private int first(TreeNode node) {
        return node.left == null ? node.val : first(node.left);
    }

    @Override
    public int last() {
        return last(root);
    }

    private int last(TreeNode node) {
        return node.right == null ? node.val : first(node.right);
    }


}
