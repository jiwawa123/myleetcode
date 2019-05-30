package com.ji.algo.L751_800;/*
    user ji
    data 2019/5/30
    time 4:14 PM
*/

import com.ji.algo.L401_450.SumOfLeft;

import java.util.HashMap;
import java.util.Map;

public class CountPrime {
    public static void main(String[] args) {

    }

    public int countPrimeSetBits(int L, int R) {
        Map<Integer, Integer> map = new HashMap<>();
        int arr[] = {2, 3, 5, 7, 11, 13, 17, 19};
        for (int k : arr
                ) {
            map.put(k, 1);
        }
        int sum = 0;
        for (int i = L; i <= R; i++) {
            int tmp = i, count = 0;
            while (tmp > 0) {
                count += tmp % 2;
                tmp /= 2;
            }
            if (map.containsKey(count))
                sum++;
        }
        return sum;
    }
}
