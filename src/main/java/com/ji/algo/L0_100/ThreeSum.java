package com.ji.algo.L0_100;/*
    user ji
    data 2019/4/8
    time 10:34 AM
*/

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        threeSum(arr);
    }

    /*
    解题思路：
    1.第一层循环，直接使用a[i]
    2.第二层循环，直接使用satrt和end之间的一个递增，一个递减，最终时间复杂度为O(n*2)
    */
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if(map.containsKey(nums[i]))
                continue;
            if (nums[i] > 0)
                break;
            int start = i + 1;
            int end = nums.length - 1;
            if (nums[start] + nums[i] > 0)
                continue;
            int target = nums[i] * -1;
            while (start < end) {
                if (nums[start] + nums[end] == target) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    map.put(nums[i],1);
                    tmp.add(nums[start]);
                    tmp.add(nums[end]);
                    set.add(tmp);
                    start++;
                    continue;
                } else if (nums[start] + nums[end] < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
