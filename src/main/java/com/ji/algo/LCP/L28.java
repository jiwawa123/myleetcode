package com.ji.algo.LCP;

import java.util.*;

/**
 * @Author: Bei Chang
 * @Date: 2022/08/07/上午9:22
 */
public class L28 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 9};
        System.out.println(purchasePlans(arr, 10));
    }

    public static int purchasePlans(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new LinkedList<>();
        long res = 0;
        for (int k : nums
        ) {
            if (!map.containsKey(k)) {
                list.add(k);
            }
            map.put(k, map.getOrDefault(k, 0) + 1);
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            int now = list.get(i);
            int len = map.get(now);
            if (now >= target) {
                break;
            }
            if (now * 2 <= target) {
                res += (len) * (len - 1) / 2;
            }

            int last = target - now;
            for (int j = i + 1; j < list.size(); j++) {
                if (last < list.get(j)) {
                    break;
                }
                res += (len) * map.get(list.get(j));
            }
        }

        return (int) ((int) res % (Math.pow(10, 9) + 7));
    }
}
