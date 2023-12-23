package com.ji.algo.L2901_2950;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/28/16:02
 */
public class L2903 {
    public static void main(String[] args) {

    }

    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int[] res = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length && j <= i + indexDifference; j++) {
                if (Math.abs(nums[i] - nums[j]) <= valueDifference) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }
}
