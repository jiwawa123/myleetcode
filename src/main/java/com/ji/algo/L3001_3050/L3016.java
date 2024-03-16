package com.ji.algo.L3001_3050;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2024/03/16/16:25
 */
public class L3016 {
    public int minimumPushes(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : word.toCharArray()
        ) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int[] arr = new int[map.size()];
        int index = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()
        ) {
            arr[index++] = entry.getValue();
        }
        Arrays.sort(arr);
        int res = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            res += ((arr.length - i - 1) / 8 + 1) * arr[i];
        }
        return res;

    }
}
