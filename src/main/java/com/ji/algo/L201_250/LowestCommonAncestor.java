package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/22
    time 7:54 PM
*/

import com.ji.algo.Util.TreeNode;

public class LowestCommonAncestor {
    public static void main(String[] args) {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val == root.val || q.val == root.val)
            return root;
        if ((p.val < root.val && q.val > root.val) || (p.val > root.val && q.val < root.val))
            return root;
        if (p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left, p, q);
        else
            return lowestCommonAncestor(root.right, p, q);
    }
}
