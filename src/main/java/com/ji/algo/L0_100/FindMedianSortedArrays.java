package com.ji.algo.L0_100;/*
    user ji
    data 2019/4/3
    time 9:11 PM
*/

public class FindMedianSortedArrays {
    public static void main(String[] args) {
        int arr[] = {1, 2};
        int arr1[] = {3, 4};
        System.out.println(findMedianSortedArrays(arr, arr1));
    }

    //合并两个数组时间复杂度O(m+n)
    // 考虑如果直接在while中寻找中间位数，可能会出现某一个数组特别短的情况
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length + nums2.length];
        int i = 0, j = 0;
        int index = 0;
        int count = arr.length;
        boolean flag = true;
        if (count % 2 == 0) {
            flag = false;
        }
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                arr[index] = nums1[i];
                i++;
            } else {
                arr[index] = nums2[j];
                j++;
            }
            index++;
        }
        while (i < nums1.length)
            arr[index++] = nums1[i++];
        while (j < nums2.length)
            arr[index++] = nums2[j++];
        if (flag)
            return arr[count / 2];
        return 1.0 * (arr[count / 2 - 1] + arr[count / 2]) / 2;
    }
}
