package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/10/11:28
 */
public class LO21 {
    public static void main(String[] args) {

    }

    public int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            if (nums[i] % 2 == 0 && nums[j] % 2 == 1) {
                swap(nums, i, j);
                i++;
                j--;
                continue;
            }
            if (nums[i] % 2 == 0) {
                j--;
            } else {
                i++;
            }
        }
        return nums;
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
