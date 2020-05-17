package com.ji.algo.L751_800;/*
    user ji
    data 2019/5/14
    time 5:21 PM
*/

import com.ji.algo.Util.TreeNode;

public class MinDiff {
    public static void main(String[] args) {

    }
    TreeNode pre;
    int min = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        help(root);
        return  min;
    }
    public void help(TreeNode treeNode){
        if(treeNode == null){
            return;
        }else {
            help(treeNode.left);
            if(pre != null  && Math.abs(treeNode.val - pre.val) < min){
                min = Math.abs(treeNode.val - pre.val);
            }
            pre = treeNode;
            help(treeNode.right);
        }
    }
}
