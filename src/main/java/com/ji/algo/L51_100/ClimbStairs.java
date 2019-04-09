package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/9
    time 5:15 PM
*/

public class ClimbStairs {
    public static void main(String[] args) {

    }

    public int climbStairs(int n) {
        if (n <= 2)
            return n;
        int f = 1;
        int s = 2;
        int index = 2;
        while (index < n) {
            int tmp = s;
            s += f;
            f = tmp;
        }
        return s;
    }
}
