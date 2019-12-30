package com.ji.algo.L1251_1300;/*
    user ji
    data 2019/12/22
    time 9:25 PM
*/

import java.util.*;

public class IsPossibleDivide {
    public static void main(String[] args) {

        int arr[] = {15, 16, 17, 18, 19, 16, 17, 18, 19, 20, 6, 7, 8, 9, 10, 3, 4, 5, 6, 20};
        System.out.println(isPossibleDivide(arr, 5));
    }


    public static boolean isPossibleDivide(int[] nums, int k) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> index = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        if (nums.length % k != 0)
            return false;
        for (int i = 0; i < nums.length; i++) {
            if (!index.containsKey(nums[i])) {
                list.add(nums[i]);
                map.put(nums[i], 1);
                index.put(nums[i], i);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }

        }
        while (!map.isEmpty()) {
            int start = list.get(0);
            list.remove(0);
            int count = 1;
            int len = map.get(start);
            map.remove(start);
            boolean flag = true;
            while (count < k) {
                if (!map.containsKey(start + 1) || map.get(start + 1) < len)
                    return false;
                if (map.get(start + 1) == len && flag) {
                    list.remove(0);
                    map.remove(start + 1);
                } else {
                    flag = false;
                    map.put(start + 1, map.get(start + 1) - len);
                }
                count += 1;
                start += 1;
            }
        }
        return true;
    }
}
