package com.ji.algo.L601_650;/*
    user ji
    data 2019/8/25
    time 10:53 AM
*/

import java.util.Arrays;

public class LeastInterval {
    public static void main(String[] args) {

    }

    public int leastInterval(char[] tasks, int n) {
        int arr[] = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            arr[tasks[i] - 'A'] += 1;
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 25; i >= 0; i--) {
            if (arr[i] != arr[25]) {
                break;
            }
            count++;
        }
        //公式算出的值可能会比数组的长度小，取两者中最大的那个
        return Math.max((arr[25] - 1) * (n + 1) + count, tasks.length);
    }
}
