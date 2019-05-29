package com.ji.new_algo;/*
    user ji
    data 2019/5/29
    time 8:28 PM
*/

import java.util.HashMap;
import java.util.Map;

//dp 算法求解数组里面存不存在指定的元素的和等于给定目标
public class BackPack {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 7, 1, 8, 2};
        long a = System.currentTimeMillis();
        System.out.println(isContainsSum(arr, 6));
        System.out.println(isContainsSum(arr, 50));
        System.out.println(isContainsSum(arr, 20));
        System.out.println(isContainsSum(arr, 6));
        System.out.println(isContainsSum(arr, 50));
        System.out.println(isContainsSum(arr, 20));
        System.out.println(isContainsSum(arr, 6));
        System.out.println(isContainsSum(arr, 50));
        System.out.println(isContainsSum(arr, 20));
        System.out.println(isContainsSum(arr, 6));
        System.out.println(isContainsSum(arr, 50));
        System.out.println(isContainsSum(arr, 20));
        System.out.println(isContainsSum(arr, 6));
        System.out.println(isContainsSum(arr, 50));
        System.out.println(isContainsSum(arr, 20));
        long b = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
        System.out.println(isContainsSumII(arr, 6));
        System.out.println(isContainsSumII(arr, 50));
        System.out.println(isContainsSumII(arr, 20));
        System.out.println(isContainsSumII(arr, 6));
        System.out.println(isContainsSumII(arr, 50));
        System.out.println(isContainsSumII(arr, 20));
        System.out.println(isContainsSumII(arr, 6));
        System.out.println(isContainsSumII(arr, 50));
        System.out.println(isContainsSumII(arr, 20));
        System.out.println(isContainsSumII(arr, 6));
        System.out.println(isContainsSumII(arr, 50));
        System.out.println(isContainsSumII(arr, 20));
        System.out.println(System.currentTimeMillis() - b);

    }

    public static boolean isContainsSum(int arr[], int k) {
        boolean flag[][] = new boolean[arr.length][k + 1];
        for (int i = 0; i < flag.length; i++) {
            flag[i][0] = true;
        }
        for (int i = 1; i < flag[0].length; i++) {
            flag[0][i] = false;
        }
        if (arr[0] <= k)
            flag[0][arr[0]] = true;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < flag[i].length; j++) {
                if (flag[i - 1][j]) {
                    flag[i][j] = true;
                    continue;
                }
                if (j >= arr[i] && flag[i - 1][j - arr[i]]) {
                    flag[i][j] = true;
                }
            }
        }
        return flag[arr.length - 1][k];
    }

    public static boolean isContainsSumII(int arr[], int k) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            Map<Integer, Integer> tmp = new HashMap<>();
            for (int kk : map.keySet()
                    ) {
                tmp.put(kk + arr[i], 1);
                tmp.put(kk, 1);
            }
            tmp.put(arr[i], 1);
            map = tmp;
        }
        return map.containsKey(k);
    }
}
