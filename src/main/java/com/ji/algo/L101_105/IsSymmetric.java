package com.ji.algo.L101_105;/*
    user ji
    data 2019/4/11
    time 8:05 PM
*/

import com.ji.algo.Util.TreeNode;

public class IsSymmetric {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(2);
        System.out.println(isSymmetric(t1));
    }

    public static boolean isSymmetric(TreeNode root) {
        if (null == root || (root.left == null && root.right == null))
            return true;
        return isSame(root.left, root.right);
    }

    public static boolean isSame(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return true;
        if (t1 == null || t2 == null)
            return false;
        if (t1.value != t2.value)
            return false;
        return isSame(t1.left, t2.right) && isSame(t1.right, t2.left);
    }
}
