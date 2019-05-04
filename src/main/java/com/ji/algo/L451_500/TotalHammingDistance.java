package com.ji.algo.L451_500;/*
    user ji
    data 2019/5/4
    time 9:15 AM
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TotalHammingDistance {
    public static void main(String[] args) {
        int arr[] = {4, 14, 2};
        System.out.println(new TotalHammingDistance().totalHammingDistance(arr));
    }

    public int totalHammingDistance(int[] nums) {
        int total = 0;
        for(int i = 0; i < 32; i++) {
            int distance = 0;
            for(int j = 0; j < nums.length; j++) {
                if((nums[j] & (1 << i - 1)) != 0)
                    distance++;
            }
            total += distance*(nums.length - distance);
        }
        return total;
    }
}
