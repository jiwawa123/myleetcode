package com.ji.algo.L751_800;/*
    user ji
    data 2019/7/23
    time 4:34 PM
*/

public class MaxChunksToSorted {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3};
        System.out.println(maxChunksToSorted(arr));
    }

    public static int maxChunksToSorted(int[] arr) {
        int index = 0;
        int max = 0;
        int count = 0;
        while (index < arr.length) {
            max = Math.max(arr[index], max);
            if (index == max) {
                count++;
                max++;
            }
            index++;
        }
        return count;
    }
}
