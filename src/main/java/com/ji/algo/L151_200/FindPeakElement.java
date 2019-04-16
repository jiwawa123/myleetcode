package com.ji.algo.L151_200;/*
    user ji
    data 2019/4/16
    time 9:47 AM
*/

public class FindPeakElement {
    public static void main(String[] args) {
        int arr[] = {2,1};
        System.out.println(findPeakElement(arr));
    }

    //使用二分查找
    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while(left < right){
            mid = left + (right - left)/2;
            if(mid == 0 && nums[mid] > nums[mid+1] ||
                    mid == nums.length - 1 && nums[mid] > nums[mid-1] ||
                    nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]){
                return mid;
            }
            if(nums[mid] > nums[mid+1]){ // 左边肯定有峰值
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}
