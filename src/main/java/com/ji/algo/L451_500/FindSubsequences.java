package com.ji.algo.L451_500;/*
    user ji
    data 2019/5/30
    time 10:14 PM
*/

import java.util.ArrayList;
import java.util.List;

public class FindSubsequences {
    public static void main(String[] args) {

    }

    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> tmp = new ArrayList<>();
        help(nums, 0, tmp, new ArrayList<>());
        return tmp;
    }

    public void help(int nums[], int start, List<List<Integer>> tmp, List<Integer> list) {
        if (list.size() >= 2) {
            tmp.add(list);
        }
        for (int i = start; i < nums.length; i++) {
            if (list.size() == 0) {
                list.add(nums[i]);
                help(nums, i + 1, tmp, list);
                list.remove(list.size() - 1);
            }else{
                if(list.get(list.size())<=nums[i]){
                    list.add(nums[i]);
                    help(nums, i + 1, tmp, list);
                    list.remove(list.size() - 1);
                }
            }
        }
    }
}
