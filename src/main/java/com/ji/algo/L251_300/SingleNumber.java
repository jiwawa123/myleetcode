package com.ji.algo.L251_300;/*
    user ji
    data 2019/7/1
    time 5:23 PM
*/

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {

    }

    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                map.remove(nums[i]);
            else
                map.put(nums[i], 1);
        }
        int res[] = new int[2];
        int index = 0;
        for (int k : map.keySet()
                ) {
            res[index++] = k;
        }
        return res;
    }
}
