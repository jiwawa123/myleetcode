package com.ji.algo.G1011;

import com.ji.algo.Util.TreeNode;

import java.util.Stack;

/**
 * user ji
 * data 2020/10/12
 * time 7:49 上午
 */
public class L530 {
    public static void main(String[] args) {

    }

    public int getMinimumDifference(TreeNode root) {
        int res = Integer.MAX_VALUE;
        Stack<TreeNode> stack = new Stack<>();
        boolean f = false;
        int last = 0;
        while (root != null && !stack.isEmpty()) {
            if (root != null) {
                stack.add(root);
                root = root.left;
            } else {
                root = stack.pop();
                if (f) {
                    res = Math.min(res, root.val - last);
                } else {
                    f = true;
                }
                last = root.val;
                root = root.right;
            }
        }
        return res;
    }
}
