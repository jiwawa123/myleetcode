package com.ji.algo.L651_700;/*
    user ji
    data 2019/6/18
    time 9:23 AM
*/

import com.ji.algo.Util.TreeNode;

public class TrimBST {
    public static void main(String[] args) {

    }
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root==null)
            return null;
        if(root.val <L)
            return trimBST(root.right,L,R);
        else if(root.val >=L&&root.val <=R){
            root.left = trimBST(root.left,L,R);
            root.right = trimBST(root.right,L,R);
            return root;
        }
        else
            return trimBST(root.left,L,R);

    }
}
