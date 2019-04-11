package com.ji.algo.L101_105;/*
    user ji
    data 2019/4/11
    time 9:05 PM
*/

import com.ji.algo.Util.TreeNode;

public class MaxDepth {
    public static void main(String[] args) {

    }
    //
    public int maxDepth(TreeNode root) {
        return depth(root,0);

    }
    public int depth(TreeNode root,int count){
        if(root==null)
            return count;
        else
            return Math.max(depth(root.left,count+1),depth(root.right,count+1));

    }
    public int maxDepthII(TreeNode root) {
        if(root==null){
            return 0;
        }else{
            return 1+ Math.max(maxDepthII(root.left),maxDepthII(root.right));
        }
    }
}
