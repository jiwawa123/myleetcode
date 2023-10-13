package com.ji.ready202309;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/12/23:39
 */
public class L268 {
    public static void main(String[] args) {

    }

    public int missingNumber(int[] nums) {
        boolean max = false;
        int index = 0;
        int t = 0;
        for (int i = 0; i < nums.length; i++) {
            int now = Math.abs(nums[i]);
            if (nums[i] == nums.length) {
                max = true;
            } else {
                if (nums[now] == 0) {
                    t = now;
                }
                nums[now] = -nums[now];
            }
        }
        if (max == false) {
            return nums.length;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return i;
            }
            if (nums[i] == 0 && t != i) {
                return i;
            }
        }
        return 0;
    }
}
