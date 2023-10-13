package com.ji.ready202309;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/12/08:34
 */
public class LO61 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 8, 5, 4};
        isStraight(arr);
    }

    public static boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int zero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
            } else {
                if (i == 0 || nums[i - 1] == 0) {
                    continue;
                } else {
                    if (nums[i] == nums[i - 1])
                        return false;
                    if (nums[i] - nums[i - 1] > (1 + zero)) {

                        return false;
                    } else {
                        zero -= (nums[i] - nums[i - 1] - 1);
                    }
                }
            }
        }
        return true;
    }
}
