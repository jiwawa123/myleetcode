package com.ji.algo.L251_300;/*
    user ji
    data 2019/9/3
    time 6:15 PM
*/

import com.ji.algo.Util.TreeNode;

public class BinaryTreeLongestConsecutiveSequence {
    public static void main(String[] args) {

    }

    int count = 0;
    public int getLongestConsecutiveSequence(TreeNode root) {
        if (root == null)
            return 0;
        help(root, 1);
        return count;
    }

    public void help(TreeNode root, int dep) {
        if (root == null)
            return;
        count = Math.max(count, dep);
        if (root.left != null && root.left.val == root.val + 1) {
            help(root.left, dep + 1);
        } else {
            help(root.left, 1);
        }
        if (root.right != null && root.right.val == root.val + 1) {
            help(root.right, dep + 1);
        } else {
            help(root.right, 1);
        }
    }
}
