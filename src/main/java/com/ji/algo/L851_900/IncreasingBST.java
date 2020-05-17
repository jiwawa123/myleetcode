package com.ji.algo.L851_900;/*
    user ji
    data 2019/5/30
    time 10:03 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.Stack;

public class IncreasingBST {
    public static void main(String[] args) {

    }

    public TreeNode increasingBST(TreeNode root) {
        TreeNode tmp = new TreeNode(0);
        TreeNode right = tmp;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                right.right = new TreeNode(right.val);
                right = right.right;
                root = root.right;
            }
        }
        return tmp.right;
    }
}
