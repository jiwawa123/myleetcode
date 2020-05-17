package com.ji.algo.L901_950;/*
    user ji
    data 2019/5/20
    time 10:58 AM
*/

import com.ji.algo.Util.TreeNode;

public class RangeSumBST {
    public static void main(String[] args) {

    }

    int sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        help(root, L, R);
        return sum;
    }

    public void help(TreeNode root, int L, int R) {
        if (root == null)
            return;
        if (root.val < L) {
            help(root.right, L, R);
        }
        if (root.val > R) {
            help(root.left, L, R);
        }
        if (root.val >= L && root.val <= R) {
            sum += root.val;
            help(root.left, L, R);
            help(root.right, L, R);
        }
    }
}
