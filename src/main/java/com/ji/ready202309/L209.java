package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/29/21:09
 */
public class L209 {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        new L209().minSubArrayLen(7, arr);
    }

    public int minSubArrayLen(int target, int[] nums) {
        int len = Integer.MAX_VALUE;
        int sum = 0, left = 0, right = 0;

        while (right < nums.length) {
            if (sum >= target) {
                len = Math.min(len, right - left);
                while (sum >= target) {
                    sum -= nums[left];
                    left++;
                    if (sum >= target) {
                        len = Math.min(len, right - left);
                    }
                }
            } else {
                sum += nums[right];
                right++;
                if (sum >= target) {
                    len = Math.min(len, right - left);
                }
            }
        }
        while (sum >= target) {
            sum -= nums[left];
            left++;
            if (sum >= target) {
                len = Math.min(len, right - left);
            }
        }
        return len;
    }
}
