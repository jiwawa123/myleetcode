package com.ji.algo.L2651_2700;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2023/05/20/09:56
 */
public class L2682 {
    public static void main(String[] args) {
        circularGameLosers(5, 2);
    }

    public static int[] circularGameLosers(int n, int k) {
        Set<Integer> set = new HashSet<>();
        int[] flag = new int[n];
        int start = 0;
        int index = 1;
        flag[start] = 1;
        set.add(0);
        while (flag[start] < 2) {
            start = (start + index * k) % n;
            set.add(start);
            index++;
            flag[start]++;
        }
        int[] res = new int[n - set.size()];
        int len = 0;
        for (int i = 0; i < n; i++) {
            if (flag[i] == 0) {
                res[len++] = i + 1;
            }
        }
        return res;
    }
}
