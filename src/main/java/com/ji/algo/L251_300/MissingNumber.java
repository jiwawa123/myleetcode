package com.ji.algo.L251_300;/*
    user ji
    data 2019/4/23
    time 8:26 PM
*/

public class MissingNumber {
    public static void main(String[] args) {

    }

    public int missingNumber(int[] nums) {
        int tmp[] = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            tmp[nums[i]] = 1;
        }

        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] != 1)
                return i;
        }
        return 0;
    }
    public int missingNumberII(int[] nums) {
        int missNum = 0;
        for(int i=1;i<=nums.length;i++){
            missNum =  missNum + i - nums[i-1];
        }
        return missNum;
    }
    public int missingNumberIII(int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum^=nums[i];
            sum^=i;
        }
        return sum;
    }
}
