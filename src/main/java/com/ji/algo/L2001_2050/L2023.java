package com.ji.algo.L2001_2050;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/24/10:22
 */
public class L2023 {
    public static void main(String[] args) {

    }

    public int numOfPairs(String[] nums, String target) {
        Map<String, Integer> map = new HashMap<>();
        int res = 0;
        for (String str : nums
        ) {
            map.put(str, map.getOrDefault(str, 0) + 1);

        }
        for (int i = 0; i < nums.length; i++) {
            if (target.startsWith(nums[i])) {
                String last = target.substring(nums[i].length());
                if (map.containsKey(last)) {
                    int l = map.get(last);
                    res += last.equals(nums[i]) ? l - 1 : l;
                }
            }
        }

        return res;
    }
}
