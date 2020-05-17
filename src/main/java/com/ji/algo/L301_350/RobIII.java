package com.ji.algo.L301_350;/*
    user ji
    data 2019/7/31
    time 9:54 AM
*/

import com.ji.algo.Util.TreeNode;

public class RobIII {
    public static void main(String[] args) {

    }
    public int rob(TreeNode root) {
        int arr[] = help(root);
        return Math.max(arr[0],arr[1]);
    }
    public int[] help(TreeNode root){
        int arr[] = new int[2];
        if(root==null){
            return arr;
        }else{
            int left[] = help(root.left);
            int right[] = help(root.right);
            arr[0] = root.val + left[1] + right[1];
            arr[1] = left[0]+right[0];
            if(arr[0]<arr[1])
                arr[0] = arr[1];
            return arr;
        }
    }
}
