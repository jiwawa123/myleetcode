package com.ji.algo.L701_750;/*
    user ji
    data 2019/5/30
    time 4:03 PM
*/

import java.util.ArrayList;
import java.util.List;

public class SelfDivide {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1,22));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= right; i++) {
            if (help(i))
                list.add(i);
        }
        return list;
    }

    public static boolean help(int n) {
        int tmp = n;
        while (tmp > 0) {
            if(tmp%10==0)
                return false;
            if (n % (tmp%10)!= 0)
                return false;
            tmp /= 10;
        }
        return true;
    }
}
