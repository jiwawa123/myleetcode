package com.ji.algo.game;/*
    user ji
    data 2019/9/25
    time 8:41 AM
*/

import java.util.Arrays;

public class L34 {
    public static void main(String[] args) {
        int arr[] = {2,2};
        System.out.println(Arrays.toString(new L34().searchRange(arr,2)));
    }
    int res[] = {Integer.MAX_VALUE,Integer.MIN_VALUE};
    public int[] searchRange(int[] nums, int target) {
        int i = 0, j = nums.length-1;
        while(i<=j){
            int med = (j-i)/2+i;
            if(nums[med]==target){
                res[0] = Math.min(res[0],med);
                res[1] = Math.max(res[1],med);
                helpL(nums,target,0,med-1);
                helpR(nums,target,med+1,nums.length-1);
                break;
            }else if(nums[med]<target){
                i =  med+1;
            }else{
                j = med -1;
            }
        }
        if(res[0]==Integer.MAX_VALUE) res[0] = -1;
        if(res[1]==Integer.MIN_VALUE) res[1] = -1;
        return res;
    }
    public void helpL(int nums[],int target,int start,int end){
        if(start>end)
            return;
        int i = start, j = end;
        while(i<=j){
            int med = (j-i)/2+i;
            if(nums[med]==target){
                res[0] = Math.min(res[0],med);
                helpL(nums,target,0,med-1);
                break;
            }else if(nums[med]<target){
                i =  med+1;
            }else{
                j = med -1;
            }
        }
    }
    public void helpR(int nums[],int target,int start,int end){
        if(start>end)
            return;
        int i = start, j = end;
        while(i<=j){
            int med = (j-i)/2+i;
            if(nums[med]==target){
                res[1] = Math.max(res[1],med);
                helpR(nums,target,med+1,nums.length-1);
                break;
            }else if(nums[med]<target){
                i =  med+1;
            }else{
                j = med -1;
            }
        }
    }
}
