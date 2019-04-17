package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/17
    time 9:24 PM
*/

import java.util.HashMap;
import java.util.Map;

public class IsHappy {
    public static void main(String[] args) {

    }

    public boolean isHappy(int n) {
        if (n == 1)
            return true;
        if (n == 0)
            return false;
        int tmp = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (tmp == 0 && !map.containsKey(n)) {
            map.put(n, 0);
            while (n > 0) {
                tmp += (n % 10) * (n % 10);
                n /= 10;
            }
            if (tmp == 1)
                return true;
            n = tmp;
            tmp = 0;
        }
        return false;
    }
}
