package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/22
    time 11:10 PM
*/

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {

    }

    public List<String> summaryRanges(int[] nums) {
        List<String> tmp = new ArrayList<>();
        if (nums == null)
            return tmp;
        int start = nums[0];
        int end = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - end == 1)
                end = nums[i];
            else {
                if (start == end)
                    tmp.add(start + "");
                else
                    tmp.add(start + "->" + end);
                start = nums[i];
                end = nums[i];
            }
        }
        if (start == end)
            tmp.add(start + "");
        else
            tmp.add(start + "->" + end);
        return tmp;
    }
}
