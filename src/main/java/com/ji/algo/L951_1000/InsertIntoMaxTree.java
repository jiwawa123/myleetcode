package com.ji.algo.L951_1000;/*
    user ji
    data 2019/7/1
    time 10:18 AM
*/

import com.ji.algo.Util.TreeNode;

public class InsertIntoMaxTree {
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        if (root.val < val) {
            TreeNode tmp = new TreeNode(val);
            tmp.left = root;
            return tmp;
        }
        root.right = insertIntoMaxTree(root.right, val);
        return root;

    }
}
