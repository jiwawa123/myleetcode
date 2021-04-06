package com.ji.algo.G0404;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * user ji
 * data 2021/4/4
 * time 8:14 下午
 */

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(302);
        root.left = new TreeNode(196);
        root.right = new TreeNode(100);
//        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(162);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);
        root.left.right.left = new TreeNode(178);
        TreeNode tmp = solve(root);
        help(tmp);
    }

    public static TreeNode solve(TreeNode root) {
        if (root == null)
            return null;
        TreeNode left = solve(root.left);
        if (left == null) {
            root.left = null;
            root.right = null;
            return root;
        }
        TreeNode right = solve(root.right);
        if (right == null) {
            root.left = null;
            root.right = null;
            return root;
        }
        return root;
    }

    public static void help(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        if (root == null)
            return;
        queue.add(root);
        while (!queue.isEmpty()) {
            Queue<TreeNode> que = new LinkedList();
            List<Integer> tmp = new LinkedList();
            while (!queue.isEmpty()) {
                TreeNode t = queue.remove();
                System.out.println(t.val);
                tmp.add(t.val);
                if (t.left != null)
                    que.add(t.left);
                if (t.right != null)
                    que.add(t.right);


            }
            queue = que;
        }
    }
}
