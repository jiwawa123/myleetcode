package com.ji.algo.L201_250;/*
    user ji
    data 2019/6/17
    time 10:59 AM
*/

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 3, 3, 2, 2, 2};
        String s = "";

        System.out.println(majorityElement(arr));
    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if (nums == null)
            return list;
        if (nums.length < 2) {
            list.add(nums[0]);
            return list;
        }
        int a = nums[0];
        int b = nums[1];
        int countA = 0;
        int countB = 0;

        for (int i = 0; i < nums.length; i++) {
            if (countA == 0 && b != nums[i])
                a = nums[i];
            else if (countB == 0 && a != nums[i])
                b = nums[i];
            if (nums[i] == a)
                countA++;
            else if (nums[i] == b && a != b)
                countB++;
            else {
                countA--;
                countB--;
            }
        }
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == a)
                count1++;
            else if (nums[i] == b)
                count2++;
        }

        if (count1 > nums.length / 3)
            list.add(a);
        if (count2 > nums.length / 3)
            list.add(b);
        return list;
    }
}
