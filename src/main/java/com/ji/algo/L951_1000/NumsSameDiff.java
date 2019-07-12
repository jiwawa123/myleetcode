package com.ji.algo.L951_1000;/*
    user ji
    data 2019/7/12
    time 3:46 PM
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumsSameDiff {
    public static void main(String[] args) {

    }

    public int[] numsSameConsecDiff(int N, int K) {
        Set<Integer> list = new HashSet<>();

        for (int j = 1; j <= 9; j++) {
            help(list, j + "", N, K);
        }

        int res[] = new int[list.size()];
        int i = 0;
        for (int t : list
                ) {
            res[i++] = t;
        }
        return res;
    }

    public void help(Set<Integer> list, String sp, int N, int K) {
        if (sp.length() == N) {
            list.add(Integer.valueOf(sp));
            return;
        }
        int last = sp.charAt(sp.length() - 1) - '0';
        if (last + K <= 9)
            help(list, sp + (last + K), N, K);
        if (last - K <= 9 && last - K >= 0)
            help(list, sp + (last - K), N, K);
    }
}
