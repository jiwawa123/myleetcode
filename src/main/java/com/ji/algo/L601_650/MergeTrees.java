package com.ji.algo.L601_650;/*
    user ji
    data 2019/5/12
    time 9:28 AM
*/

import com.ji.algo.Util.TreeNode;

public class MergeTrees {
    public static void main(String[] args) {

    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        TreeNode root = new TreeNode(t1.value + t2.value);
        root.left = mergeTrees(t1.left,t2.left);
        root.right = mergeTrees(t1.right,t2.right);
        return root;
    }
}
