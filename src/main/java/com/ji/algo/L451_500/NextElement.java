package com.ji.algo.L451_500;/*
    user ji
    data 2019/5/5
    time 9:31 PM
*/

import java.util.Arrays;

public class NextElement {
    public static void main(String[] args) {

    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int tmp = -1;
            boolean flag = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j])
                    flag = true;
                if (nums2[j] > nums1[i] && flag) {
                    tmp = nums2[j];
                    break;
                }
            }
            arr[i] = tmp;
        }
        return arr;

    }
}
