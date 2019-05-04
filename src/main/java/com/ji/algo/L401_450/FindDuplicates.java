package com.ji.algo.L401_450;/*
    user ji
    data 2019/5/4
    time 9:58 AM
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FindDuplicates {
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(arr));
    }

    public static List<Integer> findDuplicates(int nums[]) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                list.add(index + 1);
            } else {
                nums[index] = -nums[index];
            }

        }
        return list;
    }
}
