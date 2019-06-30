package com.ji.algo.L701_750;/*
    user ji
    data 2019/6/30
    time 10:09 AM
*/

public class NumSubarrayProductLessThanK {
    public static void main(String[] args) {

    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int cnt = 0;
        int ml = 1;
        int st = 0;
        for (int i = 0; i < nums.length; i++) {
            ml*=nums[i];
            while(ml>=k&&st<=i){
                ml/=nums[st];
                st++;
            }
            cnt+=(i-st+1);
        }
        return cnt;
    }
}
