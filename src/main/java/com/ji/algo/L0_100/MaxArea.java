package com.ji.algo.L0_100;/*
    user ji
    data 2019/4/7
    time 11:42 PM
*/

import java.util.Map;

public class MaxArea {
    public static void main(String[] args) {

    }
    // 前后指针，同时遍历，保留大的那一部分
    public int maxArea(int[] arr) {
        int answer = 0;
        int i = 0, j = arr.length;
        while (i < j) {
            int high = Math.max(arr[i], arr[j]);
            answer = Math.max(answer, high * (j + 1 - i));
            if (arr[i] > arr[j])
                j--;
            else
                i++;
        }
        return answer;
    }
}
