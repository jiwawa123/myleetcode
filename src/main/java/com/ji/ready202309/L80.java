package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/03/08:44
 */
public class L80 {
    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {
        int index = 0, tmp = -10000, len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == tmp && len >= 2) {
                continue;
            } else {
                if (nums[i] != tmp) {
                    tmp = nums[i];
                    nums[index++] = tmp;
                    len = 1;
                } else {
                    nums[index++] = tmp;
                    len++;
                }
            }
        }


        return index;
    }
}
