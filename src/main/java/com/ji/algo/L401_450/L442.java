package com.ji.algo.L401_450;/*
    user ji
    data 2019/9/28
    time 8:59 AM
*/

import java.util.ArrayList;
import java.util.List;

public class L442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> rs = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] < 0) {
                rs.add(Math.abs(nums[i]));
            } else {
                nums[Math.abs(nums[i]) - 1] *= -1;
            }
        }
        return rs;
    }
}
