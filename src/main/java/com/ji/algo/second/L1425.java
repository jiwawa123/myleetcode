package com.ji.algo.second;

import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/7/24
 * time 3:40 下午
 */
public class L1425 {
    public static void main(String[] args) {

    }

    public int constrainedSubsetSum(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return 0;
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        int res = dp[0];
        LinkedList<Integer> list = new LinkedList<>();
        list.add(res);
        for (int i = 1; i < nums.length; i++) {
            int idx = list.getFirst();
            dp[i] = Math.max(nums[i], dp[idx] + nums[i]);
            res = Math.max(res, dp[i]);
            // 维持一个单调栈
            while (!list.isEmpty() && (i - list.getFirst() >= k || dp[list.getFirst()] < dp[i])) {
                list.pollFirst();
            }
            list.add(i);
        }

        return res;
    }
}
