package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/12
    time 7:35 AM
*/

import com.ji.algo.Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SortedArrayToBST {
    public static void main(String[] args) {
        int arr[] = {-10, -3, 0, 5, 9};
        new SortedArrayToBST().sortedArrayToBST(arr);
    }

    //不要一上来就使用list，这样比较费时间
//    public TreeNode sortedArrayToBST(int[] nums) {
//        if (null == nums || nums.length == 0)
//            return null;
//        int med = nums.length / 2;
//        TreeNode root = new TreeNode(nums[med]);
//        List<Integer> left = new ArrayList<>();
//        List<Integer> right = new ArrayList<>();
//        for (int i = 0; i <= med - 1; i++) {
//            left.add(nums[i]);
//        }
//        for (int i = med + 1; i < nums.length; i++) {
//            right.add(nums[i]);
//        }
//        root.left = sort(left);
//        root.right = sort(right);
//        return root;
//    }
//
//    public TreeNode sort(List<Integer> list) {
//        if (null == list)
//            return null;
//        int med = list.size()/2;
//        TreeNode root = new TreeNode(list.get(med));
//        List<Integer> left = new ArrayList<>();
//        List<Integer> right = new ArrayList<>();
//        for (int i = 0; i < med - 1; i++) {
//            left.add(list.get(i));
//        }
//        for (int i = med + 1; i < list.size(); i++) {
//            right.add(list.get(i));
//        }
//        root.left = sort(left);
//        root.right = sort(right);
//        return root;
//    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if (null == nums || nums.length == 0)
            return null;
        return getSort(nums, 0, nums.length);

    }

    public TreeNode getSort(int nums[], int start, int end) {
        if (start > end)
            return null;
        int med = (start + end) / 2;
        TreeNode root = new TreeNode(nums[med]);
        root.left = getSort(nums, start, med - 1);
        root.right = getSort(nums, med + 1, end);
        return root;
    }
}
