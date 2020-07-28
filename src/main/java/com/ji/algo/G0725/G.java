package com.ji.algo.G0725;

/**
 * user ji
 * data 2020/7/25
 * time 10:17 下午
 */
public class G {
    public static void main(String[] args) {
        System.out.println(countOdds(1, 10));
    }

    public static int countOdds(int low, int high) {
        int res = 0;
        if (high % 2 != 0) {
            res++;
            high--;
        }

        if (low % 2 != 0) {
            res++;
            low++;
        }
        return (high - low) / 2 + res;
    }
}
