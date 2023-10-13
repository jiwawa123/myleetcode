package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/10/11:16
 */
public class L26 {

    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int last = nums[0], index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (last != nums[i]) {
                last = nums[i];
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
