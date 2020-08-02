package com.ji.algo.yfd;

import java.util.*;

/**
 * user ji
 * data 2020/8/1
 * time 6:51 下午
 */
public class M2 {
    static int max = 1000000003;
    static Set<Integer>[] set;
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        set = new HashSet[n];
        for (int i = 0; i < n; i++) {
            set[i] = new HashSet<>();
        }
        int res = 0;

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int t = sc.nextInt();
            map.put(i, p);
            if (t == 0) {
                res = i;
                continue;
            }
            set[t - 2].add(i);

        }
        getMax(res);
        System.out.println(tmp);
    }

    static int tmp = 0;

    public static int getMax(int start) {
        if (set[start].size() == 0)
            return Math.max(0, map.get(start));
        int min = 0;
        int val = map.get(start);
        for (int t : set[start]
        ) {
            min = Math.max(min, Math.max(val, val + getMax(t)) % max);
            min %= max;
        }
        tmp = Math.max(tmp, min) % max;
        return min;
    }
}
