package com.ji.algo.L201_250;/*
    user ji
    data 2019/8/29
    time 10:58 PM
*/

import com.ji.algo.Util.TreeNode;

public class CountUnivalueSubtrees {
    public static void main(String[] args) {

    }

    int count = 0;

    public int getCountUniSubTrees(TreeNode root) {
        if (root == null)
            return 0;
        visit(root);
        return count;
    }
    public void visit(TreeNode root){
        if(root==null)
            return;
        help(root);
        help(root.left);
        help(root.right);
    }
    public boolean help(TreeNode root) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null)
            return true;
        boolean l = true;
        boolean r = true;
        if (root.left != null) {
            if (root.left.val != root.val)
                return false;
            l = help(root.left);
        }
        if (root.right != null) {
            if (root.right.val != root.val)
                return false;
            r = help(root.right);
        }
        return l & r;
    }
}
