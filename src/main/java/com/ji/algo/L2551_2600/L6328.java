package com.ji.algo.L2551_2600;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2023/04/02/17:56
 */
public class L6328 {
    public static void main(String[] args) {
        int[] arr = {-1000};
        maximumCostSubstring("adaa", "d", arr);
    }

    public static int maximumCostSubstring(String s, String chars, int[] vals) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            map.put(chars.charAt(i), vals[i]);
        }
        int sum = 0;
        int max = 0;
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                arr[i] = map.get(s.charAt(i));
            } else {
                arr[i] = s.charAt(i) - 'a' + 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + sum > 0) {
                sum += arr[i];
                max = Math.max(max, sum);
            } else {
                sum = 0;
            }
        }
        return max;
    }
}
