package com.ji.algo.L651_700;/*
    user ji
    data 2019/5/12
    time 2:21 PM
*/

import com.ji.algo.Util.TreeNode;

public class SearchBST {
    public static void main(String[] args) {

    }
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)
            return null;
        if(root.value == val){
            return root;
        }else if(root.value>val){
            return searchBST(root.left,val);
        }else{
            return searchBST(root.right,val);
        }
    }
}
