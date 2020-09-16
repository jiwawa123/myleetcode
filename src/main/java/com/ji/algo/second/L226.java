package com.ji.algo.second;

import com.ji.algo.Util.TreeNode;

/**
 * user ji
 * data 2020/9/16
 * time 8:08 上午
 */
public class L226 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
         root.left = new TreeNode(2);
         root.right = new TreeNode(3);
         invertTree(root);
    }
    public static TreeNode invertTree(TreeNode root) {
        if(root==null)
            return root;
        TreeNode left = invertTree(root.right);
        TreeNode right = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }
}
