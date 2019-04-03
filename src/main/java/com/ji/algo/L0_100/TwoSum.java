package com.ji.algo.L0_100;/*
    user ji
    data 2019/4/3
    time 4:49 PM
*/

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2,7,11};
        twoSum(arr,9);
    }

    /*
    此题目解释，最快的方式就是使用空间换时间的方式，使用map即可
     */
    public static int[] twoSum(int[] nums, int target) {
        int re[] = new int[2];
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.getOrDefault(target - nums[i], -1) != -1) {
                re[0] = map.get(target - nums[i]);
                re[1] = i;
            }else{
                map.put(nums[i],i);
            }
        }
        return re;

    }
}
