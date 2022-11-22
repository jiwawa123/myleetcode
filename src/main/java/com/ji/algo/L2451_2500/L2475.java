package com.ji.algo.L2451_2500;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: Bei Chang
 * @Date: 2022/11/22/上午9:00
 */
public class L2475 {
    public static void main(String[] args) {

    }

    public int unequalTriplets(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        List<Integer> list = new LinkedList<>();
        for (int n : nums
        ) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                list.add(n);
                map.put(n, 1);
            }
        }
        int res = 0;
        for (int i = 0; i < list.size() - 2; i++) {
            for (int j = i + 1; j < list.size() - 1; j++) {
                for (int k = j + 1; k < list.size(); k++) {
                    res += map.get(list.get(i)) * map.get(list.get(j)) * map.get(list.get(k));
                }
            }
        }
        return res;
    }
}
