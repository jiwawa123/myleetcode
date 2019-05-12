package com.ji.algo.L451_500;/*
    user ji
    data 2019/5/12
    time 9:45 AM
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTargetSumWays {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        int arr[] = {1,1,1,1,1};
        System.out.println(findTargetSumWays(arr, 3));
        System.out.println(System.currentTimeMillis() - a);
    }

    public static int findTargetSumWays(int[] nums, int S) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            Map<Integer, Integer> tmp = new HashMap<>();
            for (int k : map.keySet()) {
                tmp.put(k + nums[i], map.get(k)+tmp.getOrDefault(k+nums[i],0));
                tmp.put(k - nums[i], map.get(k)+tmp.getOrDefault(k-nums[i],0));
            }
            map = tmp;
        }
        return map.getOrDefault(S,0);
    }
}
