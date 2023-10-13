package com.ji.ready202309;

import com.ji.algo.Util.TreeNode;

import java.util.Stack;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/20:51
 */
public class L98 {
    public static void main(String[] args) {

    }

    public boolean isValidBST(TreeNode root) {

        long t = Long.MIN_VALUE;
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.add(root);
                root = root.left;
            } else {
                root = stack.pop();
                if (t > root.val) {
                    return false;
                }
                t = root.val;
                root = root.right;
            }
        }


        return true;


    }
}
