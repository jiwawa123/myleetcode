package com.ji.algo.G0607;

/**
 * user ji
 * data 2020/6/7
 * time 10:27 上午
 */
public class G1 {

    public int[] shuffle(int[] nums, int n) {
        int res[] = new int[nums.length];
        for (int i = 0; i < n; i++) {
            res[2 * i] = nums[i];
        }
        for (int i = n; i < 2 * n; i++) {
            res[2 * i + 1] = nums[i];
        }

        return res;
    }
}
