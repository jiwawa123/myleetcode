package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/21
    time 9:57 PM
*/

import com.ji.algo.Util.TreeNode;

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        root.left = invertTree(root.right);
        root.right = invertTree(root.right);
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        return root;

    }
}
