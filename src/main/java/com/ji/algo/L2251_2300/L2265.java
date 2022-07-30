package com.ji.algo.L2251_2300;

import com.ji.algo.Util.TreeNode;

/**
 * @Author: Bei Chang
 * @Date: 2022/05/15/下午12:03
 */
public class L2265 {
    public static void main(String[] args) {

    }

    int res = 0;

    public int averageOfSubtree(TreeNode root) {
        help(root);
        return res;
    }

    public int[] help(TreeNode root) {
        if (root == null) {
            return new int[2];
        }
        int[] result = new int[2];
        int[] left = help(root.left);
        int[] right = help(root.right);

        int sum = root.val + left[0] + right[0];
        int avg = sum / (1 + left[1] + right[1]);
        if (root.val == avg) {
            res++;
        }
        result[0] = sum;
        result[1] = 1 + left[1] + right[1];
        return result;
    }
}
