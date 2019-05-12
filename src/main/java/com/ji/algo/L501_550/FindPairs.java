package com.ji.algo.L501_550;/*
    user ji
    data 2019/5/12
    time 9:32 AM
*/

import java.util.HashMap;
import java.util.Map;

public class FindPairs {
    public static void main(String[] args) {

    }

    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int count = 0;
        if (k != 0) {
            for (int kk : map.keySet()
                    ) {
                if (map.containsKey(kk + k))
                    count++;
            }
        } else {
            for (int kk : map.keySet()
                    ) {
                if (map.get(kk) > 1)
                    count++;
            }
        }

        return count;
    }
}
