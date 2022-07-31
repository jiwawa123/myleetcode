package com.ji.algo.L2251_2300;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2022/07/31/上午10:09
 */
public class L2295 {
    public static void main(String[] args) {

    }

    public int[] arrayChange(int[] nums, int[][] operations) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int num : nums
        ) {
            map.put(num, index++);
        }
        for (int i = 0; i < operations.length; i++) {
            int pre = operations[i][0];
            int next = operations[i][1];
            int l = map.get(pre);
            nums[map.get(pre)] = next;
            map.remove(pre);
            map.put(next, l);

        }
        return nums;
    }
}
