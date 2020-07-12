package com.ji.algo.ms;

import java.util.*;

/**
 * user ji
 * data 2020/7/12
 * time 6:15 下午
 */
public class G2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            char[] tmp = sc.next().toCharArray();
            Arrays.sort(tmp);
            String t = String.valueOf(tmp);
            map.put(t, map.getOrDefault(t, 0) + 1);
            max = Math.max(max, map.get(t));
        }
        System.out.println(max);
    }
}
