package com.ji.algo.mt;

import java.util.*;

/**
 * user ji
 * data 2020/8/29
 * time 3:25 下午
 */
public class G3 {
    static int res = 0;
    static int dis = 0;
    static int result = Integer.MAX_VALUE;
    static Set<Integer>[] set;
    static boolean f1[];
    static boolean f2[];
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x == y) {
            System.out.println(0);
            return;
        }
        set = new HashSet[n + 1];
        for (int i = 0; i < n + 1; i++) {
            set[i] = new HashSet<>();
        }
        for (int i = 0; i < n - 1; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            set[start].add(end);
            set[end].add(start);
        }
        f1 = new boolean[n + 1];
        f2 = new boolean[n + 1];
        dfsII(x, 0);
        dfs(y, x, 0);
        //System.out.println(res + "\t" + dis);
        System.out.println(Math.min(res + dis, result));

    }

    public static void dfs(int start, int x, int dep) {
        if (start == x) {
            dis = dep;
            return;
        }
        if (map.get(start) <= dep) {
            result = Math.min(result, map.get(res) + dep);
        }

        if (f1[start])
            return;
        res = Math.max(res, dep);
        f1[start] = true;
        for (int t : set[start]) {
            dfs(t, x, dep + 1);
        }
    }

    public static void dfsII(int start, int dep) {
        if (f2[start])
            return;
        map.put(start, dep);
        f2[start] = true;
        for (int t : set[start]) {
            dfsII(t, dep + 1);
        }
    }
}
