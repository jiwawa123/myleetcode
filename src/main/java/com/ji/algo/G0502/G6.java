package com.ji.algo.G0502;

import java.util.Arrays;

/**
 * user ji
 * data 2021/5/16
 * time 7:12 下午
 */
public class G6 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(memLeak(2, 2)));
    }

    public static int[] memLeak(int memory1, int memory2) {
        int arr[] = new int[3];
        int l1 = memory1, l2 = memory2;
        int i = 1;
        for (; i <= Math.max(l1, l2); i++) {
            if (l1 >= l2) {
                l1 -= i;
            } else {
                l2 -= i;
            }
        }
        arr[0] = i;
        arr[1] = l1;
        arr[2] = l2;
        return arr;
    }
}
