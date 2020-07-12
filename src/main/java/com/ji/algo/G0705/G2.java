package com.ji.algo.G0705;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * user ji
 * data 2020/7/5
 * time 4:09 下午
 */
public class G2 {
    public static void main(String[] args) {
        G2 g2 = new G2();
        int l[] = {};
        int r[] = {0,1,2,3,4,5,6,7};
        System.out.println(g2.getLastMoment(7, l, r));
    }

    int res = -1;

    public int getLastMoment(int n, int[] left, int[] right) {
        if (left.length == 0 && right.length == 0)
            return 0;
        Map<Integer, Integer> l = new HashMap<>();
        Map<Integer, Integer> r = new HashMap<>();
        for (int i = 0; i < left.length; i++) {
            l.put(left[i], 0);

        }
        for (int i = 0; i < right.length; i++) {
            r.put(right[i], 0);
        }
        help(n, l, r);
        return res;
    }

    public void help(int n, Map<Integer, Integer> left, Map<Integer, Integer> right) {
        if (left.isEmpty() && right.isEmpty())
            return;
        res++;
        System.out.println("");
        System.out.println("+++++++++++++" + res);
        Map<Integer, Integer> l = new HashMap<>();
        Map<Integer, Integer> r = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : left.entrySet()
        ) {
            if (entry.getKey() == 0)
                continue;
            l.put(entry.getKey() - 1, 0);
            System.out.print(entry.getKey() - 1 + " ");
        }
        System.out.println("");
        for (Map.Entry<Integer, Integer> entry : right.entrySet()
        ) {
            if (entry.getKey() == n)
                continue;
            r.put(entry.getKey() + 1, 0);
            System.out.print(entry.getKey() + 1 + " ");
        }
        help(n, l, r);
    }

}
