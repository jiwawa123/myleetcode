package com.ji.algo.second;

import com.ji.algo.Util.TreeNode;

/**
 * user ji
 * data 2020/8/2
 * time 8:12 上午
 */
public class Flatten {
    public static void main(String[] args) {

    }

    public void flatten(TreeNode root) {
        if (root == null)
            return;
        flatten(root.left);
        flatten(root.right);
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = null;
        while (root.right != null) root = root.right;
        root.right = tmp;
    }
}
