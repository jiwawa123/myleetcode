package com.ji.algo.wyII;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * user ji
 * data 2020/9/12
 * time 2:59 下午
 */
public class G3 {
    static int res = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int last = sc.nextInt();
        Set<Integer>[] set = new HashSet[count];
        for (int i = 0; i < count; i++) {
            set[i] = new HashSet<>();
        }

        for (int i = 0; i < count - 1; i++) {
            int start = sc.nextInt();
            set[start].add(i + 1);
            set[i + 1].add(start);

        }
        help(set, last, 0, 0, new boolean[count]);
        System.out.println(res);
    }

    public static void help(Set<Integer>[] set, int last, int all, int start, boolean flag[]) {
        if (last == 0 || all >= set.length) {
            res = Math.max(res, all);
            return;
        }
        boolean next[] = Arrays.copyOfRange(flag, 0, flag.length);
        if (!flag[start]) {
            next[start] = true;
            all++;
        }
        for (int end : set[start]
        ) {
            help(set, last - 1, all, end, next);
        }
    }
}
