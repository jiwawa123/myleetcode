package com.ji.algo.L2351_2400;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2022/09/06/上午8:48
 */
public class L2395 {
    public static void main(String[] args) {

    }

    public boolean findSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int tmp = nums[i] + nums[i + 1];
            if(set.contains(tmp))
                return true;
            set.add(tmp);
        }
        return false;
    }
}
