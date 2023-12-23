package com.ji.algo.L2851_2900;

import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/28/18:18
 */
public class L2855 {
    public static void main(String[] args) {

    }

    public int minimumRightShifts(List<Integer> nums) {
        int res = 0;
        int t = 0;
        int min = nums.get(0), max = nums.get(0), last = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            if (last < nums.get(i)) {
                if (t == 1) {
                    if (nums.get(i) > min) {
                        return -1;
                    }
                }else{
                    min = Math.min(min, nums.get(i));
                    max = Math.max(max, nums.get(i));
                }
            } else {
                t++;
                res = nums.size() - i;
                if (t > 1) {
                    return -1;
                }
            }
            last = nums.get(i);
        }
        return res;
    }
}
