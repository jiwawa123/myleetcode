package com.ji.algo.L851_900;/*
    user ji
    data 2019/6/15
    time 9:44 AM
*/

import com.ji.algo.Util.TreeNode;

public class PruneTree {
    public static void main(String[] args) {

    }
    public TreeNode pruneTree(TreeNode root) {
        if(!one(root))
            return null;
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        return root;
    }
    public boolean one(TreeNode root){
        if(root==null)
            return false;
        if(root.val ==1)
            return true;
        return one(root.left)||one(root.right);
    }
}
