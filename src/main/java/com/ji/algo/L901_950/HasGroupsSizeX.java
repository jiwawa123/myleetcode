package com.ji.algo.L901_950;/*
    user ji
    data 2019/6/28
    time 9:49 PM
*/

import java.util.HashMap;
import java.util.Map;

public class HasGroupsSizeX {
    public static void main(String[] args) {

    }

    public boolean hasGroupsSizeX(int[] arr) {
        if (arr == null || arr.length < 2)
            return false;
        Map<Integer, Integer> map = new HashMap();
        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        int min = Integer.MAX_VALUE;
        for (int t : map.values()
                ) {
            min = Math.min(t, min);
        }
        if (min < 2)
            return false;
        for (int i = 2; i <= min; i++) {
            boolean flag = true;
            for (int t : map.values()) {
                if (t % i != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return true;
        }
        return false;
    }
}
