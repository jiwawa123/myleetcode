package com.ji.algo.mt;

import java.util.Scanner;

/**
 * user ji
 * data 2020/8/29
 * time 3:26 下午
 */
public class G4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = n;
        }
        int res = 0;
        for (int i = 1; i <= max; i++) {
            for (int j = i + 1; j <= max; j++) {
                if (isMatch(i, j, arr)) {
                    res += max - j + 1;
                    break;
                }
            }
        }
        System.out.println(res);
    }

    public static boolean isMatch(int l, int r, int arr[]) {
        int last = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] > 0 && arr[i] < l) || (arr[i] > r)) {
                if (arr[i] >= last) {
                    last = arr[i];
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
