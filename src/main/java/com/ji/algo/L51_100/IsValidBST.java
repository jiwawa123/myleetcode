package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/10
    time 3:22 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.Stack;

public class IsValidBST {
    public static void main(String[] args) {

    }

    public boolean isValidBST(TreeNode root) {
        boolean flag = true;
        int min = 0;
        Stack<TreeNode> stack = new Stack();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                TreeNode tmp = stack.pop();
                root = tmp.right;
                if(flag){
                    min = tmp.value;
                    flag = false;
                    continue;
                }
                if (min > tmp.value)
                    return false;
                min = tmp.value;

            }
        }
        return true;
    }
}
