package com.ji.algo.L101_150;/*
    user ji
    data 2019/8/5
    time 12:38 PM
*/


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ConnectII {
    public static void main(String[] args) {

    }

    public class Node {
        int val;
        Node left;
        Node right;
        Node next;
    }

    public Node connect(Node root) {
        if (root == null)
            return root;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Node> list = new ArrayList<>();
            Queue<Node> tmp = new LinkedList<>();
            while (!queue.isEmpty()) {
                Node t = queue.remove();
                list.add(t);
                if (t.left != null) {
                    tmp.add(t.left);
                }
                if (t.right != null) {
                    tmp.add(t.right);
                }

            }
            for (int i = 0; i < list.size() - 1; i++) {
                list.get(i).next = list.get(i + 1).next;
            }
            queue = tmp;
        }
        return root;
    }
}
