package com.ji.new_algo;/*
    user ji
    data 2019/9/18
    time 4:55 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class TreeAbout {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        postTreeNode(root).stream().forEach(System.out::println);
    }

    public static void preTreeNode(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                System.out.println(root.value);
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop().right;
            }
        }
    }

    public static void InTreeNode(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                System.out.println(root.value);
                root = root.right;
            }
        }
    }

    //一个讨巧的方法，先序右根遍历；中 右 左 逆序之后 变成了 左 右 中
    public static List<Integer> postTreeNode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                list.add(root.value);
                root = root.right;
            } else {
                root = stack.pop();
                root = root.left;
            }
        }
        Collections.reverse(list);
        return list;
    }
}
