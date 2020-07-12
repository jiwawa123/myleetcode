package com.ji.algo.G0628;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * user ji
 * data 2020/6/28
 * time 10:26 上午
 */
public class G2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(canArrange(arr, 5));
    }

    public static boolean canArrange(int[] arr, int k) {
        boolean flag[] = new boolean[arr.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int last = arr[i] % k;
            map.put(last, map.getOrDefault(last, 0) + 1);
        }
        if (map.getOrDefault(0, 0) % 2 != 0)
            return false;
        for (int i = -k + 1; i < k; i++) {
            if (!map.containsKey(i))
                continue;
            if (i == 0) {
                continue;
            }
            if (i < 0) {
                if (map.get(i) > map.getOrDefault(-i, 0) + map.getOrDefault(-(k + i), 0)) {
                    return false;
                }
                int count = map.get(i);
                map.remove(i);
                if (map.getOrDefault(-i, 0) >= count) {
                    map.put(-i, map.getOrDefault(-i, 0) - count);
                } else {
                    count -= map.getOrDefault(-i, 0);
                    map.remove(-i);
                    map.put(-(k + i), map.getOrDefault(-(k + i), 0) - count);
                }
                continue;
            }

            if (map.get(i) > map.getOrDefault(-i, 0) + map.getOrDefault(k - i, 0))
                return false;
            int count = map.get(i);
            map.remove(i);
            if (map.getOrDefault(-i, 0) >= count) {
                map.put(-i, map.getOrDefault(-i, 0) - count);
            } else {
                count -= map.getOrDefault(k - i, 0);
                map.remove(-i);
                map.put(k - i, map.getOrDefault((k + i), 0) - count);
            }
        }

        return true;
    }
}
