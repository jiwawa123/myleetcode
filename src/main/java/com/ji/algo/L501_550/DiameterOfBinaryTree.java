package com.ji.algo.L501_550;/*
    user ji
    data 2019/5/9
    time 4:53 PM
*/

import com.ji.algo.Util.TreeNode;

//这个问题中使用辅助函数来求二叉树的高度

public class DiameterOfBinaryTree {
    int count = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        help(root);
        return count;
    }
    public void help(TreeNode root){
        if(root==null)
            return ;
        int tmp = depth(root.left)+depth(root.right);
        count = Math.max(tmp,count);
        help(root.left);
        help(root.right);

    }
    public int depth(TreeNode root){
        if(root==null)
            return 0;
        return 1+Math.max(depth(root.left),depth(root.right));
    }
}
