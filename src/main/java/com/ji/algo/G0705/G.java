package com.ji.algo.G0705;

import java.util.Arrays;

/**
 * user ji
 * data 2020/7/5
 * time 4:04 下午
 */
public class G {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length == 2)
            return true;
        Arrays.sort(arr);
        int d = arr[0] - arr[1];
        for (int i = 2; i < arr.length - 1; i++) {
            if (arr[i] - arr[i - 1] != d)
                return false;
        }
        return true;
    }
}
