package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/17
    time 9:05 AM
*/

import com.ji.algo.Util.TreeNode;

import java.util.Arrays;

public class BuildTreeII {
    public static void main(String[] args) {

    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder == null || postorder.length == 0)
            return null;
        if (postorder.length == 1)
            return new TreeNode(postorder[0]);
        int len = postorder.length - 1;
        TreeNode root = new TreeNode(postorder[len]);
        int index = 0;
        for (int i = 0; i <inorder.length ; i++) {
            if(inorder[i]==postorder[len]){
                index = i;
                break;
            }
        }
        int left[] = Arrays.copyOfRange(inorder,0,index);
        int right[] = Arrays.copyOfRange(inorder,index+1,inorder.length);
        int post_left[] = Arrays.copyOfRange(postorder,0,left.length);
        int post_right[] =Arrays.copyOfRange(postorder,left.length,postorder.length-1);
        root.left = buildTree(left,post_left);
        root.right = buildTree(right,post_right);
        return root;
    }
}
