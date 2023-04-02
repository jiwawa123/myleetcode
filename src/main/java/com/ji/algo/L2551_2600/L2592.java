package com.ji.algo.L2551_2600;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2023/03/31/20:57
 */
public class L2592 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 1, 3, 1};
        System.out.println(maximizeGreatness(arr));
    }

    public static int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int pre = nums[0];
        int preTmp = 0;
        int tmp = 0;
        for (int i = 1; i < nums.length; i++) {
            if (pre == nums[i]) {
                if (preTmp > 0) {
                    preTmp--;
                    sum++;
                }
                tmp++;
            } else {
                sum++;
                pre = nums[i];
                preTmp += tmp;
                tmp = 0;
            }
        }
        return sum;
    }
}
