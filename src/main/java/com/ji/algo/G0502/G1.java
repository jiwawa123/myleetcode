package com.ji.algo.G0502;

/**
 * user ji
 * data 2021/5/2
 * time 4:34 下午
 */
public class G1 {
    public static void main(String[] args) {

    }

    public int getMinDistance(int[] nums, int target, int start) {
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                res = Math.min(res, Math.abs(i - start));
            }
        }
        return res;
    }
}
