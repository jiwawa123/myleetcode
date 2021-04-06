package com.ji.algo.L1801_1850;

/**
 * user ji
 * data 2021/3/28
 * time 5:16 下午
 */
public class L1806 {
    public static void main(String[] args) {
        System.out.println(reinitializePermutation(4));
    }

    public static int reinitializePermutation(int n) {
        int count = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        while (count == 0 || !isMatch(arr)) {
            int tmp[] = new int[n];
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    tmp[i] = arr[i / 2];
                } else {
                    tmp[i] = arr[n / 2 + (i - 1) / 2];
                }
            }
            count++;
            arr = tmp;
        }
        return count;
    }

    public static boolean isMatch(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (i != arr[i])
                return false;
        }
        return true;
    }
}
