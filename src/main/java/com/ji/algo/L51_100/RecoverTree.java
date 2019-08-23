package com.ji.algo.L51_100;/*
    user ji
    data 2019/8/23
    time 7:52 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class RecoverTree {
    public static void main(String[] args) {

    }

    public void recoverTree(TreeNode root) {
        if (root == null)
            return;
        int tmp = Integer.MAX_VALUE;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode last = root;
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                if (root.value > tmp) {
                    int swap = root.value;
                    root.value = last.value;
                    last.value = swap;
                    return;
                } else {
                    tmp = root.value;
                    last = root;
                }
                root = root.right;
            }
        }
    }
}
