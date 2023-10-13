package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/17:20
 */
public class L169 {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        int m = nums[0], len = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == m) {
                len++;
            } else {
                len--;
                if (len == 0) {
                    len = 1;
                    m = nums[i];
                }
            }
        }
        return m;
    }
}
