package com.ji.algo.game;/*
    user ji
    data 2019/10/7
    time 9:35 AM
*/

import com.ji.algo.Util.TreeNode;

public class TwoSumBSTs {
    public static void main(String[] args) {

    }

    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        if (root1 == null || root2 == null)
            return false;
        if (root1.value + root2.value == target)
            return true;
        if (root1.value + root2.value < target) {
            return twoSumBSTs(root1, root2.right, target) || twoSumBSTs(root1.right, root2, target);
        } else {
            return twoSumBSTs(root1, root2.left, target) || twoSumBSTs(root1.left, root2, target);
        }
    }
}
