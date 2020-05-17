package com.ji.algo.L401_450;/*
    user ji
    data 2019/5/2
    time 6:25 PM
*/

import com.ji.algo.Util.TreeNode;

public class PathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.right.right = new TreeNode(11);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.left.right.right = new TreeNode(1);
        new PathSum().pathSum(root, 8);
    }
    int pathnumber;
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        Sum(root,sum);
        pathSum(root.left,sum);
        pathSum(root.right,sum);
        return pathnumber;
    }


    public void Sum(TreeNode root, int sum){
        if(root == null) return;
        sum-=root.val;
        if(sum == 0){
            pathnumber++;
        }
        Sum(root.left,sum);
        Sum(root.right,sum);
    }
}