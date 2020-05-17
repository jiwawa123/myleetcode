package com.ji.algo.L701_750;/*
    user ji
    data 2019/6/19
    time 1:54 PM
*/

import com.ji.algo.Util.TreeNode;

public class InsertIntoBST {
    public static void main(String[] args) {

    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)
            return new TreeNode(val);
        if(root.val >val){
            root.left = insertIntoBST( root.left,  val);
        }else{
            root.right = insertIntoBST(root.right,  val);
        }
        return root;
    }
}
