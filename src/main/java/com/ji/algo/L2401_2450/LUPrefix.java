package com.ji.algo.L2401_2450;

/**
 * @Author: Bei Chang
 * @Date: 2022/10/23/下午12:14
 */
public class LUPrefix {
    int n;
    Boolean[] arr;

    public LUPrefix(int n) {
        this.n = n;
        arr = new Boolean[n + 1];
        arr[0] = true;
    }

    int max = 0;

    public void upload(int video) {
        arr[video] = true;
        if (video == max + 1) {
            max++;
        }
        int len = max;
        while (arr[len]) {
            len++;
        }
        max = len;
    }

    public int longest() {
        return max;
    }

}
