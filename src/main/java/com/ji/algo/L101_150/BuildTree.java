package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/17
    time 8:51 AM
*/

import com.ji.algo.Util.TreeNode;

import java.util.Arrays;

public class BuildTree {
    public static void main(String[] args) {
        int arr[] = {3, 9, 20, 15, 7};
        int inorder[] = {9, 3, 15, 20, 7};
        System.out.println(buildTree(arr,inorder));
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (null == preorder || preorder.length == 0)
            return null;
        if (preorder.length == 1)
            return new TreeNode(preorder[0]);
        TreeNode root = new TreeNode(preorder[0]);
        int index = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                index = i;
                break;
            }
        }
        int left[] = Arrays.copyOfRange(inorder, 0, index);
        int right[] = Arrays.copyOfRange(inorder, index + 1, inorder.length);
        int preLeft[] = Arrays.copyOfRange(preorder, 1, 1 + left.length);
        int preRight[] = Arrays.copyOfRange(preorder, 1 + preLeft.length, preorder.length);
        root.left = buildTree(preLeft, left);
        root.right = buildTree(preRight, right);
        return root;
    }
}
