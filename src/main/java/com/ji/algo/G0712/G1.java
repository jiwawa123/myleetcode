package com.ji.algo.G0712;

import java.util.HashMap;
import java.util.Map;

/**
 * user ji
 * data 2020/7/12
 * time 10:29 上午
 */
public class G1 {
    public static void main(String[] args) {

    }

    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int res = 0;
        for (int t : map.values()
        ) {
            res += (t - 1) * t / 2;
        }
        return res;
    }


}
