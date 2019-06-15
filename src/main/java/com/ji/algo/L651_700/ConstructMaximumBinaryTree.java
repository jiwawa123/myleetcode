package com.ji.algo.L651_700;/*
    user ji
    data 2019/6/15
    time 9:34 AM
*/

import com.ji.algo.Util.TreeNode;

import java.util.Arrays;

public class ConstructMaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        int index = -1, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                index = i;
                max = nums[i];
            }
        }
        TreeNode root = new TreeNode(max);
        int left[] = Arrays.copyOfRange(nums, 0, index);
        int right[] = Arrays.copyOfRange(nums, index + 1, nums.length);
        root.left = constructMaximumBinaryTree(left);
        root.right = constructMaximumBinaryTree(right);
        return root;
    }
}
