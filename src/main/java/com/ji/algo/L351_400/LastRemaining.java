package com.ji.algo.L351_400;/*
    user ji
    data 2019/5/2
    time 4:37 PM
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LastRemaining {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        lastRemainingII(1000000);
        System.out.println(System.currentTimeMillis() - a);
    }

    public static int lastRemaining(int n) {
        if (n == 1)
            return 1;

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            list.add(i);
        }
        boolean flag = true;
        while (list.size() > 1) {
            List<Integer> tmp = new ArrayList<>();
            if (flag) {
                for (int i = 1; i < list.size(); i += 2) {
                    tmp.add(list.get(i));
                }
                flag = !flag;
            } else {
                for (int i = list.size() - 2; i >= 0; i -= 2) {
                    tmp.add(0,list.get(i));
                }
                flag = !flag;
            }
            list = tmp;
        }
        return list.get(0);
    }
    public static int lastRemainingII(int n) {
        return n == 1 ? 1 : 2 * (n / 2 + 1 - lastRemainingII(n / 2));
    }
}
