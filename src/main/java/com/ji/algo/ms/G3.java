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
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
        int n = 4;
        int arr[] = {7, 1, -1, 0};

        Map<Integer, Integer> sum = new HashMap<>();
        int tmp = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            tmp += arr[i];
            sum.put(tmp, sum.getOrDefault(tmp, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : sum.entrySet()) {
            for (int i = -3000; i <= 3000; i++) {
                if (sum.containsKey(i * i * i - entry.getKey())) {
                    res += sum.get(i * i * i - entry.getKey());
                }
            }
        }

        System.out.println(res / 2);

    }
}
