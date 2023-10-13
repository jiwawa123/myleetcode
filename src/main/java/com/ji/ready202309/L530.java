package com.ji.ready202309;

import com.ji.algo.Util.TreeNode;

import java.util.Stack;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/03/16:13
 */
public class L530 {
    public static void main(String[] args) {

    }


    public int getMinimumDifference(TreeNode root) {
        int res = Integer.MAX_VALUE;
        Stack<TreeNode> stack = new Stack<>();
        int last = -1;
        while (root != null || !stack.isEmpty()) {
            if (root == null) {
                root = stack.pop();
                if (last == -1) {
                    last = root.val;
                } else {
                    res = Math.min(res, root.val - last);
                    last = root.val;
                }
                root = root.right;
            } else {
                stack.add(root);
                root = root.left;
            }
        }

        return res;
    }
}
