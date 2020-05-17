package com.ji.algo.L501_550;/*
    user ji
    data 2019/5/27
    time 10:43 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.Stack;

public class GetMinimumDifference {
    public static void main(String[] args) {

    }

    public int getMinimumDifference(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        boolean flag = false;
        int tmp = 0;
        int count = 0;
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                if (flag) {
                    count = Math.min(count, Math.abs(tmp - root.val));
                } else {
                    tmp = root.val;
                }
                root = root.right;
            }
        }
        return count;
    }
}
