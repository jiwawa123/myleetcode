package com.ji.ready202309;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/12/21:35
 */
public class L442 {
    public static void main(String[] args) {

    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                res.add(index);
            } else {
                nums[index] = -index;
            }
        }
        return res;
    }
}
