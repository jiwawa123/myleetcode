package com.ji.algo.G1208;/*
    user ji
    data 2019/12/8
    time 10:53 AM
*/

public class G3 {
    public static void main(String[] args) {
        int arr[] = {2,3,5,7,11};
        int arr1[] = {1,2,5,9};
        int arr2[] = {19};
        System.out.println(smallestDivisor(arr2,5));
    }

    //使用二分查找进行试探
    public static int smallestDivisor(int[] nums, int threshold) {
        int left = 1, right = 1000000;
        while (left <= right) {
            int med = left + (right - left) / 2;
            int count = 0;
            boolean flag = true;
            for (int i = 0; i < nums.length; i++) {
                count += Math.ceil(nums[i] * 1.0 / med);
                if (count > threshold) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                left = med + 1;
            } else {
                right = med - 1;
            }

        }
        return left;
    }
}
