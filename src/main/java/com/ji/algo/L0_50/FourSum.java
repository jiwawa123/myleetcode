package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/8
    time 1:43 PM
*/

import java.util.*;

public class FourSum {
    public static void main(String[] args) {

    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(i>0&&nums[i]==nums[i-1])
                continue;
            for (int j = i+1; j < nums.length; j++) {
                int start = j+1;
                int end = nums.length - 1;
                while(start<end){
                    if(nums[i]+nums[j]+nums[start]+nums[end]==target){
                        List<Integer> tmp = new ArrayList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[start]);
                        tmp.add(nums[end]);
                        set.add(tmp);
                        start++;
                        end--;
                    }else if(nums[i]+nums[j]+nums[start]+nums[end]<target){
                        start++;
                    }else{
                        end--;
                    }
                }
            }

        }
        return new ArrayList<>(set);
    }
}
