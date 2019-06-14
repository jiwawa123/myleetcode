package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/6/14
    time 5:20 PM
*/

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class MaxAncestorDiff {
    public static void main(String[] args) {

    }

    int count = 0;

    public int maxAncestorDiff(TreeNode root) {
        help(Integer.MIN_VALUE, Integer.MAX_VALUE, root);
        return count;
    }

    public void help(int max, int min, TreeNode root) {
        if (root == null)
            return;
        if (max == Integer.MIN_VALUE && min == Integer.MAX_VALUE) {
            max = min = root.value;
        } else {
            max = Math.max(root.value, max);
            min = Math.min(root.value, min);
            count = Math.max(count, max - min);
        }
        help(max, min, root.left);
        help(max, min, root.right);

    }
}
