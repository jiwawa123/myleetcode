package com.ji.algo.ms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * user ji
 * data 2020/7/12
 * time 6:15 下午
 */
public class G3 {
    public static void main(String[] args) {
        int n = 4;
        int arr[] = {7, 1, -1, 0};

        Map<Integer, Integer> sum = new HashMap<>();
        int tmp = 0;
        int res = 0;
        sum.put(0, 1);
        for (int i = 0; i < n; i++) {
            tmp += arr[i];
            sum.put(tmp, sum.getOrDefault(tmp, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : sum.entrySet()) {
            for (int i = -300; i <= 300; i++) {
                if (sum.containsKey(i * i * i - entry.getKey())) {
                    res += entry.getValue() * sum.get(i * i * i - entry.getKey());
                }
            }
        }

        System.out.println(res / 2);

    }
}
