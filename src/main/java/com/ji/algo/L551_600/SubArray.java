package com.ji.algo.L551_600;/*
    user ji
    data 2019/6/8
    time 10:19 AM
*/

public class SubArray {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            if (tmp > k)
                continue;
            if (tmp == k) {
                count++;
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                tmp+=nums[j];
                if (tmp > k)
                    break;
                if(tmp == k){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
