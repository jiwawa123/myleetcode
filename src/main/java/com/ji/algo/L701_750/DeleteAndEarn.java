package com.ji.algo.L701_750;/*
    user ji
    data 2019/8/20
    time 10:57 AM
*/

import java.util.TreeMap;

public class DeleteAndEarn {
    public static void main(String[] args) {
        int arr[] = {8, 3, 4, 7, 6, 6, 9, 2, 5, 8, 2, 4, 9, 5, 9, 1, 5, 7, 1, 4};
        System.out.println(deleteAndEarn(arr));
    }

    public static int deleteAndEarn(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int key[] = new int[map.size()];
        int value[] = new int[map.size()];

        int index = 0;
        for (int k : map.keySet()
                ) {
            key[index] = k;
            value[index] = map.get(k);
            index++;
        }
        if (map.size() == 1) {
            return key[0] * value[0];
        }
        int f = key[0] * value[0];
        int s;
        if (key[1] > key[0] + 1) {
            s = f + key[1] * value[1];
        } else {
            s = Math.max(f, key[1] * value[1]);
        }
        for (int i = 2; i < key.length; i++) {
            if (key[i] > key[i - 1] + 1) {
                int tmp = s;
                s += key[i] * value[i];
                f = tmp;
            } else {
                int tmp = s;
                int count = Math.max(key[i] * value[i] + f, s);
                s = count;
                f = tmp;
            }
        }
        return s;
    }
}
