package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/10/11:23
 */
public class L45 {
    public int jump(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < i + nums[i]; j++) {
                if (arr[j] == 0) {
                    arr[j] = arr[i] + 1;
                } else {
                    arr[j] = Math.min(arr[j], arr[i] + 1);
                }
            }
        }
        return arr[nums.length - 1];
    }
}
