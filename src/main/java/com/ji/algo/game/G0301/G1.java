package com.ji.algo.game.G0301;/*
    user ji
    data 2020/3/1
    time 10:29 AM
*/

import java.util.Arrays;

public class G1 {
    public static void main(String[] args) {

    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int res[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int tmp = 0;
            for (int j = 0; j <nums.length ; j++) {
                if(i!=j&&nums[j]<nums[i])
                    tmp++;
            }
            res[i] = tmp;
        }

        return res;
    }
}
