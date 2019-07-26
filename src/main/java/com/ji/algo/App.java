package com.ji.algo;

import java.util.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        int arr[] = {-1,2,1,-4};
        System.out.println(threeSumClosest(arr,1));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i= 0;i<nums.length;i++){
            int start = i+1;
            int end = nums.length-1;
            while(start<end){
                if(nums[start]+nums[end]==target-nums[i])
                    return target;
                if(nums[start]+nums[end]<target-nums[i]){

                    if(min<Math.abs(target - nums[i] - nums[start] -nums[end])){
                        min = Math.abs(target - nums[i] - nums[start] -nums[end]);
                        max =  nums[i] + nums[start] + nums[end];
                    }
                    start++;
                }

                else{

                    if(min<Math.abs(target - nums[i] - nums[start] -nums[end])){
                        min = Math.abs(target - nums[i] - nums[start] -nums[end]);
                        max =  nums[i] + nums[start] + nums[end];
                    }
                    end--;
                }

            }
        }
        return max;
    }
}
