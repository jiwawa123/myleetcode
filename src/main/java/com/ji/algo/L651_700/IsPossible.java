package com.ji.algo.L651_700;/*
    user ji
    data 2019/8/10
    time 9:38 AM
*/

import java.util.HashMap;
import java.util.Map;

public class IsPossible {
    public boolean isPossible(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        Map<Integer, Integer> endMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int k = nums[i];
            int v = map.get(k);
            if (v == 0) {
                continue;
            }
            if (endMap.containsKey(k - 1) && endMap.get(k - 1) > 0) {
                //检查endMap中是否有他的前一个
                map.put(k, map.get(k) - 1);
                endMap.put(k - 1, endMap.get(k - 1) - 1);
                endMap.put(k, endMap.getOrDefault(k,0) + 1);
            } else if (map.containsKey(k + 1) && map.containsKey(k + 2) && map.get(k + 1) != 0 && map.get(k + 2) != 0) {
                map.put(k, map.get(k) - 1);
                map.put(k + 1, map.get(k + 1) - 1);
                map.put(k + 2, map.get(k + 2) - 1);
                endMap.put(k + 2, endMap.getOrDefault(k + 2, 0) + 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
