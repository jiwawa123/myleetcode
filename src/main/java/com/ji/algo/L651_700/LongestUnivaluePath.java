package com.ji.algo.L651_700;/*
    user ji
    data 2019/6/25
    time 11:41 PM
*/

import com.ji.algo.Util.TreeNode;

public class LongestUnivaluePath {
    int count = 0;
    public int longestUnivaluePath(TreeNode root) {
        if(root==null)
            return count;
        help(root);
        return count-1;
    }
    public void help(TreeNode root){
        if(root==null)
            return ;
        int l = root.value;
        count = Math.max(1+help1(root.left,l)+help1(root.right,l),count);
        help(root.left);
        help(root.right);
    }
    public int help1(TreeNode root,int l){
        if(root==null||root.value!=l)
            return 0;
        return 1+Math.max(help1(root.left,l),help1(root.right,l));
    }
}
