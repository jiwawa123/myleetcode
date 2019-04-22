package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/22
    time 11:24 PM
*/

public class ProductExceptSelf {
    public static void main(String[] args) {

    }
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] re = new int[len];
        if(len == 0) return new int[]{0};
        int help = 1;
        for(int i = 0; i < len; i++){
            re[i] = help;
            help *= nums[i];
        }
        help = 1;
        for(int i = len-1; i >= 0; i--){
            re[i] *= help;
            help *= nums[i];
        }
        return re;
    }
}
