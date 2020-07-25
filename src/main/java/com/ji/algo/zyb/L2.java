package com.ji.algo.zyb;

import com.ji.algo.Util.TreeNode;

/**
 * user ji
 * data 2020/7/23
 * time 2:20 下午
 */
public class L2 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        System.out.println(getFirst(root, root.left, root.right).val);

    }

    public static TreeNode getFirst(TreeNode root, TreeNode r1, TreeNode r2) {
        if (root == r1 || root == r2) {
            return root;
        }
        boolean f1 = isContains(root.left, r1);
        boolean f2 = isContains(root.right, r2);
        if (f1 && f2)
            return root;
        if (f1)
            return getFirst(root.left, r1, r2);
        if (f2)
            return getFirst(root.right, r1, r2);
        return root;

    }

    public static boolean isContains(TreeNode root, TreeNode target) {
        if (root == null)
            return false;
        if (root == target)
            return true;
        return isContains(root.left, target) && isContains(root.right, target);
    }


}
