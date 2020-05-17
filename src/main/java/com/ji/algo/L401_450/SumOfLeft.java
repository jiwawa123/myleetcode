package com.ji.algo.L401_450;/*
    user ji
    data 2019/5/3
    time 9:14 AM
*/

import com.ji.algo.Util.TreeNode;

public class SumOfLeft {
    public static void main(String[] args) {

    }

    int count = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;
        help(root.left, true);
        help(root.right, false);
        return count;
    }

    public void help(TreeNode root, boolean flag) {
        if (root == null)
            return;
        if (flag && root != null && root.left == null && root.right == null) {
            count += root.val;
            return;
        }
        help(root.left, true);
        help(root.right, false);
    }
}
