package com.ji.algo.LCP;

import com.ji.algo.Util.TreeNode;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/28/22:41
 */
public class Offer049 {
    public static void main(String[] args) {

    }

    int sum = 0;

    public int sumNumbers(TreeNode root) {
        help(root, 0+"");
        return sum;
    }

    public void help(TreeNode root, String val) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            sum += Integer.valueOf(val + root.val);
        }
        help(root.left, val + root.val);
        help(root.right, val + root.val);
    }
}
