package com.ji.algo.L401_450;/*
    user ji
    data 2019/7/28
    time 10:09 PM
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindKthNumber {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(findKthNumber(4289384, 1922239));
        System.out.println(System.currentTimeMillis() - a);
    }

    public static int findKthNumber(int n, int k) {
        int cur = 1;
        k--;
        while (k > 0) {
            long step = 0, first = cur, last = cur + 1;
            while (first <= n) {
                step += Math.min(last, (long) (n + 1)) - first;
                first *= 10;
                last *= 10;
            }

            if (step > k) {
                //在树里
                k--;
                cur *= 10;
            }
            if (step <= k) {
                //不在树里
                k -= step;
                ++cur;
            }
        }
        return cur;
    }
}
