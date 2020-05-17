package com.ji.algo.L951_1000;/*
    user ji
    data 2019/5/23
    time 11:01 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.Stack;

public class UniqueValue {
    public static void main(String[] args) {

    }

    public boolean isUnivalTree(TreeNode root) {
        if (root == null)
            return true;
        int k = root.val;
        Stack<TreeNode> stack = new Stack();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                if (root.val != k)
                    return false;
                else
                    stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                root = root.right;
            }
        }
        return true;
    }
}
