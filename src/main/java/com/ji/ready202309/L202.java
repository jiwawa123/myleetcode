package com.ji.ready202309;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/03/11:39
 */
public class L202 {
    public static void main(String[] args) {

    }

    Set<Integer> set = new HashSet<>();

    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        if (set.contains(n)) {
            return false;
        }
        set.add(n);
        int sum = 0;
        while (n > 0) {
            int t = n % 10;
            sum += t * t;
            n /= 10;
        }
        return isHappy(sum);

    }
}
