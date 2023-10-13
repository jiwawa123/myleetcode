package com.ji.ready202309;

import com.ji.algo.Util.TreeNode;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/22/19:22
 */
public class L124 {
    public static void main(String[] args) {

    }

    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        help(root);
        return max;
    }


    public int help(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, help(root.left));
        int right = Math.max(0, help(root.right));

        max = Math.max(max, left + right + root.val);
        return Math.max(left, right) + root.val;
    }
}
