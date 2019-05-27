package com.ji.algo.L501_550;/*
    user ji
    data 2019/5/27
    time 9:31 PM
*/

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRank {
    public static void main(String[] args) {

    }

    public String[] findRelativeRanks(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        Arrays.sort(nums);
        String[] res = new String[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            int tmp = nums.length - i;
            switch (tmp) {
                case 1:
                    res[map.get(nums[i])] = "Gold Medal";
                    break;
                case 2:
                    res[map.get(nums[i])] = "Silver Medal";
                    break;
                case 3:
                    res[map.get(nums[i])] = "Bronze Medal";
                    break;
                default:
                    res[map.get(nums[i])] = tmp + "";
                    break;
            }
        }
        return res;
    }
}
