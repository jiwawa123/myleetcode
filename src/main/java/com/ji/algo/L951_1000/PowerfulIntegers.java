package com.ji.algo.L951_1000;/*
    user ji
    data 2019/6/2
    time 1:23 PM
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerfulIntegers {
    public static void main(String[] args) {
        powerfulIntegers(2,1,10);
    }

    public static List<Integer> powerfulIntegers(int x, int y, int bound) {

        Set<Integer> set = new HashSet<>();
        if (x == 1 && y == 1) {
            if (bound < 2) {
                return new ArrayList<>(set);
            } else {
                set.add(2);
                return new ArrayList<>(set);
            }
        }
        if (x == 1) {
            x = y;
            y = 1;
        }
        for (int k = 0; (int) Math.pow(x, k) < bound; k++) {
            for (int i = 0; (int) Math.pow(y, i) <= bound - (int) Math.pow(x, k); i++) {
                if ((int) (Math.pow(x, k) + Math.pow(y, i)) <= bound)
                    set.add((int) (Math.pow(x, k) + Math.pow(y, i)));
                if (y == 1)
                    break;
            }
        }
        return new ArrayList<>(set);
    }
}
