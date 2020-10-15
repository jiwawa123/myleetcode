package com.ji.algo.L101_150;

import java.util.LinkedList;
import java.util.Queue;

/**
 * user ji
 * data 2020/10/15
 * time 11:14 上午
 */
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}

public class L116 {

    public Node connect(Node root) {
        if (root == null)
            return root;
        Queue<Node> queue = new LinkedList<>();
        while (!queue.isEmpty()) {
            Queue<Node> next = new LinkedList<>();
            while (!queue.isEmpty()) {
                Node tmp = queue.remove();
                if (!queue.isEmpty()) {
                    tmp.next = queue.peek();
                }
                if (tmp.left != null)
                    next.add(tmp.left);
                if (tmp.right != null)
                    next.add(tmp.right);
            }
            queue = next;
        }
        return root;
    }
}
