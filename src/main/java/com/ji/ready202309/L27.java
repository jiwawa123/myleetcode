package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/03/08:42
 */
public class L27 {
    public static void main(String[] args) {

    }

    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
