package com.ji.algo.L551_600;/*
    user ji
    data 2019/7/14
    time 5:23 PM
*/

public class ArrayNesting {
    public static void main(String[] args) {
        int arr[ ] = {5,4,0,3,1,6,2};
        System.out.println(new ArrayNesting().arrayNesting(arr));
    }
    public int arrayNesting(int[] nums) {
        int max = 0;
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            int len = 0;
            boolean flag[] = new boolean[nums.length];
            while (!flag[start]) {
                if (arr[start] != 0) {
                    len += arr[i];
                    break;
                } else {
                    flag[start] = true;
                    start = nums[start];
                    len++;

                }
            }
            arr[i] = len;
            max = Math.max(len,max);
        }
        return max;
    }
}
