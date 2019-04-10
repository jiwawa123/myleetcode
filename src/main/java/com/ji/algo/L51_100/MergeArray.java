package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/10
    time 9:47 AM
*/

public class MergeArray {
    public static void main(String[] args) {

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = nums1[i];
        }
        int index1 = 0;
        int index2 = 0;
        int index = 0;
        while (index1 < m && index2 < n) {
            if (arr[index1] > nums2[index2]) {
                nums1[index++] = nums2[index2++];
            } else {
                nums1[index++] = arr[index1++];
            }
        }
        while (index1 < m) {
            nums1[index++] = arr[index1++];
        }
        while (index2 < n){
            nums1[index++] = nums2[index2++];
        }
    }
}
