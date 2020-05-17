package com.ji.algo.L1301_1350;/*
    user ji
    data 2020/1/30
    time 11:43 AM
*/

import com.ji.algo.Util.TreeNode;

public class SumEvenGrandparent {
    public static void main(String[] args) {

    }

    int sum = 0;

    public int sumEvenGrandparent(TreeNode root) {
        help(root, -1, -1);
        return sum;
    }

    public void help(TreeNode root, int grand, int father) {
        if (root == null)
            return;
        if (grand % 2 == 0)
            sum += root.val;
        help(root.left, father, root.val);
        help(root.right, father, root.val);
    }
}
