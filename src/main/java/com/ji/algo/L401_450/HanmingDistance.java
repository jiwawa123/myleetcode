package com.ji.algo.L401_450;/*
    user ji
    data 2019/5/10
    time 2:49 PM
*/

public class HanmingDistance {
    public static void main(String[] args) {

    }

    public int hammingDistance(int x, int y) {
        int count = 0;
        while (x > 0 && y > 0) {
            if (x % 2 != y % 2)
                count++;
            x /= 2;
            y /= 2;
        }
        while (x > 0) {
            if (x % 2 != 0)
                count++;
            x /= 2;
        }
        while (y > 0) {
            if (y % 2 != 0)
                count++;
            y /= 2;
        }
        return count;
    }
}
