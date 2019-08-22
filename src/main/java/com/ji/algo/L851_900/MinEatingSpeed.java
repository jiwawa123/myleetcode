package com.ji.algo.L851_900;/*
    user ji
    data 2019/8/22
    time 12:34 PM
*/

public class MinEatingSpeed {
    public static void main(String[] args) {
        int arr[] = {312884470};
        System.out.println(minEatingSpeed(arr, 968709470));
    }

    public static int minEatingSpeed(int[] piles, int H) {
        int max = 0;
        long sum = 0;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
            sum += piles[i];
        }
        if (H == piles.length)
            return max;
        long l = sum / H;
        long r = max;
        while (l < r) {
            long med = (r - l) / 2 + l;
            int count = 0;
            for (int i = 0; i < piles.length; i++) {
                if (piles[i] % med == 0) {
                    count += piles[i] / med;
                } else {
                    count += piles[i] / med + 1;
                }
            }
            if (count <= H) {
                r = med;
            } else
                l = med + 1;

        }
        return (int) l;
    }
}
