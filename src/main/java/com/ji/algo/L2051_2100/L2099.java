package com.ji.algo.L2051_2100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ji
 * @data 2021/12/13
 * @time 11:05 下午
 */
public class L2099 {
    public static void main(String[] args) {

    }

    public int[] maxSubsequence(int[] nums, int k) {
        int arr[] = new int[k];
        int tmp[] = nums.clone();
        Arrays.sort(nums);
        String a = null;
       switch (a){

       }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = nums.length - 1; i >= nums.length - k; i--) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int index = 0;
        for (int i = 0; i < tmp.length; i++) {
            if (map.getOrDefault(tmp[i], 0) > 0) {
                arr[index++] = tmp[i];
                map.put(tmp[i], map.get(tmp[i]) - 1);
            }
        }
        return arr;
    }
}
