package com.ji.algo.L2051_2100;

import java.util.*;

public class L2094 {
    public static void main(String[] args) {
        int[] digits = {2, 1, 3, 0};
        System.out.println(findEvenNumbers(digits).length);
    }

    public static int[] findEvenNumbers(int[] digits) {
        List<Integer> res = new LinkedList<>();
        int arr[] = new int[10];
        for (int t : digits) {
            arr[t] += 1;
        }
        for (int i = 100; i < 999; i++) {
            if (i % 2 == 0) {
                int[] t = arr.clone();
                int tmp = i;
                int a = tmp % 10;
                if (t[a] > 0) {
                    t[a]--;
                } else {
                    continue;
                }

                tmp /= 10;
                int b = tmp % 10;
                if (t[b] > 0) {
                    t[b]--;
                } else {
                    continue;
                }
                tmp /= 10;
                int c = tmp % 10;
                if (t[c] > 0) {
                    t[c]--;
                } else {
                    continue;
                }
                res.add(i);
            }
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}
