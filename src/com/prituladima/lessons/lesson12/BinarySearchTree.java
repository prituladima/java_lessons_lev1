package com.prituladima.lessons.lesson12;

public class BinarySearchTree implements IStringSet {


    private static class TreeNode {
        String val;
        TreeNode left;
        TreeNode right;
    }

    TreeNode root;
    int len;

    private int compare(String first, String second) {
        return String.CASE_INSENSITIVE_ORDER.compare(first, second);
    }


    @Override
    public boolean add(String val) {
        if (isEmpty()) {
            root = new TreeNode();
            root.val = val;
            len++;
            return true;
        } else {
            TreeNode newNode = new TreeNode();
            newNode.val = val;

            TreeNode cur = root;

            for (; ; ) {

                int compareRes = compare(val, cur.val);

                //1. root.val == val
                if (compareRes == 0) {
                    return false;
                } else if (0 < compareRes) {
                    if (cur.right == null) {
                        cur.right = newNode;
                        len++;
                        return true;
                    } else {
                        cur = cur.right;
                    }
                } else /*if(compareRes < 0)*/ {
                    if (cur.left == null) {
                        cur.left = newNode;
                        len++;
                        return true;
                    } else {
                        cur = cur.left;
                    }
                }
            }

        }

    }

    @Override
    public boolean contains(String val) {
        if (isEmpty()) {
            return false;
        } else {
            TreeNode cur = root;

            for (; ; ) {
                int compareRes = compare(val, cur.val);
                if (compareRes == 0) {
                    return true;
                } else if (0 < compareRes) {
                    if (cur.right == null) {
                        return false;
                    } else {
                        cur = cur.right;
                    }
                } else /*if(compareRes < 0)*/ {
                    if (cur.left == null) {
                        return false;
                    } else {
                        cur = cur.left;
                    }
                }
            }

        }
    }

    @Override
    public boolean remove(String val) {
        if (!contains(val)) {
            return false;
        } else {

            //for
            // cur

            //1. cur -> null
            // left == null && right == null; -> null
            //2. left != null
            // cur -> right
            //3. right != null
            // cur -> left
            //4. ???

            root = remove(root, val);
            len--;
            return true;
        }
    }

//    private TreeNode firts()

    private TreeNode remove(TreeNode cur, String val) {
        int compareRes = compare(val, cur.val);
        if (cur.right == null && cur.left == null) {
            return null;
        } else if (cur.left == null) {
            return cur.right;
        } else if (cur.right == null) {
            return cur.left;
        } else /*if(cur.right != null && cur.left != null) */ {
            String leftmost = leftmost(cur.right);
            cur.val = leftmost;
            cur.right = remove(cur.right, leftmost);
            return cur;
        }
    }

    private String leftmost(TreeNode cur) {
        return cur.left == null ? cur.val : leftmost(cur.left);
    }


    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        toString(root, output);

        return output.toString();
    }

    private void toString(TreeNode node, StringBuilder output) {
        if (node != null) {
            toString(node.left, output);
            output.append(node.val).append(' ');
            toString(node.right, output);
        }
    }


    @Override
    public int len() {
        return len;
    }

    @Override
    public boolean isEmpty() {
        return len() == 0;
    }

}
