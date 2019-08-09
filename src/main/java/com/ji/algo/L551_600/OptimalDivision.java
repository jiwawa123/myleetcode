package com.ji.algo.L551_600;/*
    user ji
    data 2019/8/9
    time 9:50 AM
*/

public class OptimalDivision {
    public String optimalDivision(int[] nums) {
        if (nums.length == 1) {
            return "" + nums[0];
        }
        if (nums.length == 2) {
            return nums[0] + "/" + nums[1];
        }
        StringBuilder sp = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                sp.append(nums);
                sp.append("/");
                continue;
            }
            if (i == 1) {
                sp.append("(");
                sp.append(nums[i]);
                sp.append("/");
                continue;
            }
            sp.append(nums[i]);
            if (i != nums.length - 1) {
                sp.append("/");
            }
            continue;
        }
        sp.append(")");
        return sp.toString();
    }
}
