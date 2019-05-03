package com.ji.algo.L351_400;/*
    user ji
    data 2019/5/3
    time 7:58 PM
*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {

    }

    Map<Integer, List<Integer>> map;
    Random random = new Random();

    public Solution(int nums[]) {
        map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> tmp = map.getOrDefault(nums[i], new ArrayList<>());
            tmp.add(i);
            map.put(nums[i], tmp);
        }
    }

    public int pick(int target) {
        List<Integer> list = map.get(target);
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}
