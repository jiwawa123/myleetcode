package com.ji.algo.game;/*
    user ji
    data 2019/10/20
    time 9:41 AM
*/

public class MaximizeSweetness {
    public static void main(String[] args) {
        int arr[] = {90670, 55382, 95298, 95795, 73204, 41464, 18675, 30104, 47442, 55307};
        System.out.println(maximizeSweetness(arr, 6));
    }

    public static int maximizeSweetness(int[] sweetness, int K) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int len = sweetness.length;
        for (int i = 0; i < len; i++) {
            sum += sweetness[i];
            min = Math.min(min, sweetness[i]);
        }
        if (K + 1 == len)
            return min;
        int max = sum / (K + 1);
        int start = min, end = max;
        int res = 0;
        while (start <= end) {
            int count = 0;
            int med = (end - start) / 2 + start;
            if (med == 56652) {
                System.out.println("   ");
            }
            int cur = 0;
            int inter_min = Integer.MAX_VALUE;
            for (int i = 0; i < len; i++) {
                cur += sweetness[i];
                if (cur >= med) {
                    count++;
                    inter_min = Math.min(inter_min, cur);
                    if (count == K + 1) {
                        break;
                    }
                    cur = 0;
                    continue;
                }
                if (i == len - 1 && cur >= med) {
                    count++;
                }

            }

            //System.out.println("count => " + count + " med => " + med + " => " + inter_min);
            if (count == K + 1) {
                start = med + 1;
                res = Math.max(res, inter_min);
            } else {
                end = med - 1;
            }

        }

        return res;
    }
}
