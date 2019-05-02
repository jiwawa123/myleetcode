package com.ji.algo.L401_450;/*
    user ji
    data 2019/5/2
    time 5:03 PM
*/

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {

    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int arr[] = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] += 1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0)
                list.add(i);
        }
        return list;
    }
    public List<Integer> findDisappearedNumbersII(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0){
                nums[index] = -nums[index];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                list.add(i + 1);
            }
        }
        return list;
    }
}
