package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/15
    time 3:25 PM
*/

import com.ji.algo.Util.TreeNode;

public class SumNumbers {
    public static void main(String[] args) {

    }

    int count = 0;

    public int sumNumbers(TreeNode root) {
        if (null == root)
            return 0;
        help_sum(root, "");
        return count;
    }

    public void help_sum(TreeNode root, String s) {
        if(root==null)
            return;
        if (root.left == null && root.right == null) {
            s += root.val;
            count+=Integer.valueOf(s);
            return;
        }
        help_sum(root.left,s+root.val);
        help_sum(root.right,s+root.val);
    }
}
