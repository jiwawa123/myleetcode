package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/10
    time 8:24 AM
*/

public class Search {
    public static void main(String[] args) {

    }

    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return false;
        //先找到旋转区域
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target)
                return true;
            if(nums[start]<nums[mid]){
                if(nums[mid]>=target&&target>=nums[start]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else if(nums[end]>nums[mid]){
                if(nums[mid]<=target&&target<=nums[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(nums[mid]==nums[start])
                    start++;
                else
                    end--;
            }
        }

        return false;
    }
}
