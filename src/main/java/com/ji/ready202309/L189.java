package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/03/08:03
 */
public class L189 {
    public static void main(String[] args) {
        L189 l189 = new L189();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        l189.rotate(arr, 3);
    }


    public void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[(i + k) % nums.length] = arr[i];
        }
    }
}
