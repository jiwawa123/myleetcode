package com.ji.algo.L501_550;/*
    user ji
    data 2019/9/28
    time 9:13 AM
*/

import java.util.HashMap;
import java.util.Map;

public class L531 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(findPairs(arr, -1));
    }

    public static int findPairs(int[] nums, int k) {
        if (k < 0)
            return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int count = 0;

        for (int t : map.keySet()
                ) {
            if (k == 0)
                count += map.get(t) > 1 ? 1 : 0;
            else
                count += map.getOrDefault(t + k, 0) == 1 ? 1 : 0;
        }
        return count;

    }
}
