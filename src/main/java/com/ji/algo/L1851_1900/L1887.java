package com.ji.algo.L1851_1900;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * user ji
 * data 2021/6/11
 * time 8:10 下午
 */
public class L1887 {
    public static void main(String[] args) {
        int arr[] = {1,1,1};
        System.out.println(reductionOperations(arr));
    }

    public static int reductionOperations(int[] nums) {

        int count = 0;
        Arrays.sort(nums);
        int min = nums[0];
        int last = nums[nums.length - 1];
        int tmp = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (min == nums[i]) {
                break;
            }

            if (last != nums[i]) {
                count += tmp;
                last = nums[i];
            }
            tmp++;
        }
        if (last != min)
            count += tmp;
        return count;
    }
}
