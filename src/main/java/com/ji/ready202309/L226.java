package com.ji.ready202309;

import com.ji.algo.Util.TreeNode;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/21:50
 */
public class L226 {
    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
