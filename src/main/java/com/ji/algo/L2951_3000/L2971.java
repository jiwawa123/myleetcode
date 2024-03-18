package com.ji.algo.L2951_3000;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2024/03/16/17:01
 */
public class L2971 {

    public static void main(String[] args) {
        int[] arr = {1, 12, 1, 2, 5, 50, 3};
        largestPerimeter(arr);
    }

    public static long largestPerimeter(int[] nums) {
        // 排序+枚举
        long ans = -1;
        long sum = 0;
        int n = nums.length;
        Arrays.sort(nums);
        sum = nums[0] + nums[1];
        for (int i = 2; i < n; i++) {
            // 最长边nums[i] 和其余边nums[0...i-1]能否形成多边形
            if (nums[i] < sum) {
                ans = sum + nums[i];
            }
            sum += nums[i];
        }
        return ans;
    }
}
