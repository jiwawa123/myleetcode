package com.ji.algo.L1701_1750;

import java.util.HashMap;
import java.util.Map;

/**
 * user ji
 * data 2021/1/22
 * time 8:06 下午
 */
public class L1726 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 10};
        System.out.println(tupleSameProduct(arr));
    }

    public static int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int tmp = nums[i] * nums[j];
                map.put(tmp, map.getOrDefault(tmp, 0) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()
        ) {
            if (entry.getValue() < 2)
                continue;

            count += entry.getValue() * (entry.getValue() - 1) * 4;

        }
        return count;
    }
}
