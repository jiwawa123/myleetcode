package com.ji.algo.L601_650;/*
    user ji
    data 2019/5/10
    time 4:01 PM
*/

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindErrorNums {
    public static void main(String[] args) {

    }

    public int[] findErrorNums(int[] nums) {
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] += 1;
        }
        int res[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2)
                res[0] = i + 1;
            if (arr[i] == 0)
                res[1] = i + 1;
        }
        return arr;
    }
}
