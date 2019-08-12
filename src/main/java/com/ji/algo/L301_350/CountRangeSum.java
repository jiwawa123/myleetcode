package com.ji.algo.L301_350;/*
    user ji
    data 2019/8/12
    time 4:59 PM
*/

public class CountRangeSum {
    public static void main(String[] args) {

    }
    public int countRangeSum(int[] nums, int lower, int upper) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            long sum = nums[i];
            if(sum>=lower&&sum<=upper){
                count++;
            }
            for(int j = i+1;j<nums.length;j++){
                sum+=nums[j];
                if(sum>=lower&&sum<=upper){
                    count++;
                }
            }
        }
        return count;
    }
}
