package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/12
    time 11:07 AM
*/

import com.ji.algo.Util.TreeNode;

public class IsBalanced {
    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = maxDepthII(root.left);
        int right = maxDepthII(root.right);
        if(Math.abs(left-right)>1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int maxDepthII(TreeNode root) {
        if(root==null){
            return 0;
        }else{
            return 1+ Math.max(maxDepthII(root.left),maxDepthII(root.right));
        }
    }
}
