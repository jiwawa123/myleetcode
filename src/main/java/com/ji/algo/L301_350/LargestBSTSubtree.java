package com.ji.algo.L301_350;/*
    user ji
    data 2019/9/6
    time 3:23 PM
*/

import com.ji.algo.Util.TreeNode;

public class LargestBSTSubtree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(8);
//        root.right = new TreeNode(15);
//        root.right.right = new TreeNode(7);
        System.out.println(new LargestBSTSubtree().getLargestBSTSubTree(root));
    }
    int count = 0;
    public int getLargestBSTSubTree(TreeNode root) {
        if (root == null)
            return 0;
        return  Math.max(help(root),count);
    }

    public int help(TreeNode leaf) {
        if (leaf == null)
            return 0;
        boolean l = true;
        boolean r = true;
        int ll = 0,rr = 0;
        if(leaf.left!=null){
            if(leaf.left.value<leaf.value){
                int left = help(leaf.left);
                if(left==0){
                    l = false;
                }else{
                    ll = left;
                }
            }else{
                l = false;
                help(leaf.left);
            }

        }
        if(leaf.right!=null){
            if(leaf.right.value>leaf.value){
                int right = help(leaf.right);
                if(right==0){
                    r = false;
                }else{
                    rr = right;
                }
            }else{
                r = false;
                help(leaf.right);
            }
        }
        if(l&&r){
            count =Math.max( 1+ ll+rr,count);
            return 1+ll+rr;
        }
        return 0;
    }
}
