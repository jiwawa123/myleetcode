package com.ji.algo.G0926;

import java.util.Arrays;

/**
 * user ji
 * data 2020/9/26
 * time 10:08 上午
 */
public class G1 {
    public static void main(String[] args) {
        Integer arr[] = {1, 2, 3, 3, 4, 5};
        //System.out.println(canBeEqual(arr));
    }

    public int canBeEqual(Integer[] weights) {
        int sum = 0;
        Arrays.sort(weights);
        for (int t : weights
        ) {
            sum += t;
        }
        if (sum % 2 != 0)
            return 0;
        int avg = sum / 2;
        if (weights[0] + weights[1] + weights[5] == avg)
            return 1;
        if (weights[0] + weights[4] + weights[5] == avg)
            return 1;
        if (weights[0] + weights[3] + weights[4] == avg)
            return 1;
        if (weights[0] + weights[2] + weights[5] == avg)
            return 1;

        return 0;
    }
}
