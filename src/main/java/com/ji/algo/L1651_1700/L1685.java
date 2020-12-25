package com.ji.algo.L1651_1700;

/**
 * user ji
 * data 2020/12/22
 * time 2:37 下午
 */
public class L1685 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5};
        System.out.println(getSumAbsoluteDifferences(arr));
    }

    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int res[] = new int[nums.length];
        // 计算前缀和
        int pre[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            pre[i] += nums[i];
            if (i > 0) {
                pre[i] += pre[i - 1];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int left = 0;
            if (i > 0)
                left = Math.abs((pre[i - 1]) - (i) * nums[i]);
            int right = Math.abs((pre[nums.length - 1] - pre[i]) - (nums.length - i - 1) * nums[i]);
            res[i] = left + right;
        }
        return res;
    }
}
