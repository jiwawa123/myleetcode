package com.ji.algo.L501_550;/*
    user ji
    data 2019/5/12
    time 9:38 AM
*/

import com.ji.algo.Util.TreeNode;

public class ConvertBST {
    public static void main(String[] args) {

    }

    public int preNum = 0;
    //递归写法
    public TreeNode convertBST(TreeNode root) {
        unPreOrder(root);
        return root;
    }
    public void unPreOrder(TreeNode root){
        if(root == null)
            return;
        unPreOrder(root.right);
        root.val += preNum;
        preNum = root.val;
        unPreOrder(root.left);
    }
}
