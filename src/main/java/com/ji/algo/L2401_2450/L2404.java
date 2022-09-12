package com.ji.algo.L2401_2450;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2022/09/12/上午11:52
 */
public class L2404 {

    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = Integer.MAX_VALUE;
        int max = 0;
        for (int t : nums
        ) {
            if (t % 2 == 0) {
                map.put(t, map.getOrDefault(t, 0) + 1);
                max = Math.max(map.get(t), max);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()
        ) {
            if (max == entry.getValue()) {
                res = Math.min(res, entry.getKey());
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
