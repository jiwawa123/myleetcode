package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/08/22:33
 */
public class L704 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        L704 l704 = new L704();
        System.out.println(l704.search(arr, 0));
        System.out.println(l704.search(arr, 6));
        System.out.println(l704.search(arr, 3));
    }

    public int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int med = (i + j) / 2;
            if (nums[med] == target) {
                return med;
            } else if (nums[med] < target) {
                i++;
            } else {
                j--;
            }
        }

        return i;

    }
}
