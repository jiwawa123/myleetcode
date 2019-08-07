package com.ji.algo.L0_50;/*
    user ji
    data 2019/8/7
    time 3:56 PM
*/

import java.util.*;

public class NextPermutation {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        nextPermutation(arr);
    }

    public static void nextPermutation(int[] nums) {
        int flag=0;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                Arrays.sort(nums,i,nums.length);
                for(int j=i;j<=nums.length-1;j++){
                    if(nums[i-1]<nums[j]) {
                        int temp=nums[i-1];
                        nums[i-1]=nums[j];
                        nums[j]=temp;
                        break;
                    }
                }
                flag=1;
                break;
            }
        }
        if(flag==0) Arrays.sort(nums);
    }
}
