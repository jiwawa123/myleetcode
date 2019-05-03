package com.ji.algo.L401_450;/*
    user ji
    data 2019/5/3
    time 9:23 AM
*/

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {

    }

    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        int tmp = 15;
        for (int i = 1; i < n; i++) {
            if (i % tmp == 0) {
                res.add("fizzbuzz");
                continue;
            }
            if (i % 3 == 0) {
                res.add("fizz");
                continue;
            }
            if (i % 5 == 0) {
                res.add("buzz");
                continue;
            }
            res.add(i + "");
        }
        return res;
    }
}
