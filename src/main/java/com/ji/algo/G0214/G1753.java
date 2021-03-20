package com.ji.algo.G0214;

import java.util.Arrays;

/**
 * user ji
 * data 2021/2/14
 * time 9:57 下午
 */
public class G1753 {
    public static void main(String[] args) {
        System.out.println(maximumScore(6, 4, 2));
    }

    public static int maximumScore(int a, int b, int c) {
        int res = 0;
        int arr[] = {a, b, c};
        while (isTrue(arr)) {
            Arrays.sort(arr);
            res += 1;
            arr[2] -= 1;
            arr[1] -= 1;
        }
        return res;
    }


    public static boolean isTrue(int arr[]) {
        int tmp = 0;
        for (int i = 0; i < 3; i++) {
            tmp += arr[i] == 0 ? 1 : 0;
        }
        return tmp < 2;
    }
}
