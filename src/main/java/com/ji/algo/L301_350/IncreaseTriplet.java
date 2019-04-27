package com.ji.algo.L301_350;/*
    user ji
    data 2019/4/27
    time 1:38 PM
*/

import java.util.ArrayList;
import java.util.List;

public class IncreaseTriplet {
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,1,2,1,2,1,2};
        System.out.println(increasingTriplet(arr));
    }

    public static boolean increasingTriplet(int[] nums) {
        if (null == nums || nums.length < 3)
            return false;
        List<Integer> list = new ArrayList();
        list.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == list.get(list.size() - 1)) {
                continue;
            }
            if (list.size() >= 3)
                return true;
            if (nums[i] > list.get(list.size() - 1)) {
                list.add(nums[i]);
                continue;
            } else {
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j) >= nums[i]) {
                        list.set(j, nums[i]);
                        break;
                    }
                }
            }
        }
        return list.size() >= 3;
    }
    public boolean increasingTripletII(int[] A) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        if(A.length < 3) {
            return false;
        }
        for(int num: A) {
            if(first > num){
                first = num;
            }else if(first < num && second > num) {
                second = num;
            }else if(num > second){
                return true;
            }
        }
        return false;
    }
}
