package com.ji.base;/*
    user ji
    data 2019/5/16
    time 11:00 AM
*/

import com.ji.algo.Util.TreeNode;

import java.util.*;

public class PreVisit {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        preVisit(root);
    }

    public static void preVisit(TreeNode root) {
        if (root == null)
            return;
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                list.add(root.value);
                stack.push(root);
                root = root.right;
            } else {
                root = stack.pop();
                root = root.left;
            }
        }
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }

    public static void inVisit(TreeNode root) {
        if (root == null)
            return;
        Stack<TreeNode> stack = new Stack();
        while (!stack.isEmpty() || root != null) {
            if (root == null) {
                root = stack.pop();
                System.out.println(root.value);
                root = root.right;
            } else {
                stack.push(root);
                root = root.left;
            }
        }
    }


}
