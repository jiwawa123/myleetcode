package com.ji.algo.N1208;

import java.util.Arrays;

/**
 * user ji
 * data 2020/12/8
 * time 8:25 上午
 */
public class G2 {
    public static void main(String[] args) {

    }

    public int maxOperations(int[] nums, int k) {
        int len = nums.length - 1;
        Arrays.sort(nums);
        if (nums[len] * 2 < k)
            return 0;
        int i = 0, j = len;
        int count = 0;
        while (i < j) {
            int tmp = nums[i] + nums[j];
            if (tmp == k) {
                i++;
                j--;
                count++;
            } else if (tmp < k) {
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
}
