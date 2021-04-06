package com.ji.algo.G0403;

import java.util.*;

/**
 * user ji
 * data 2021/4/2
 * time 7:12 下午
 */
public class G1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int len = sc.nextInt();
            int arr[] = new int[len];
            for (int j = 0; j < len; j++) {
                arr[j] = sc.nextInt();
            }
            help(arr);
        }
    }

    public static void help(int arr[]) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int next = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < next)
                continue;
            if (map.get(arr[i]) == 1)
                continue;
            next = arr[i] + 1;
            map.put(next, map.getOrDefault(next, 0) + 1);
        }
        System.out.println(map.size());
    }

}
