package com.ji.algo.L651_700;/*
    user ji
    data 2019/7/18
    time 4:29 PM
*/

public class CanPartitionKSubsets {
    public static void main(String[] args) {

    }
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        if (sum % k != 0) {
            return false;
        }
        int target = sum / k;
        avg = target;
        all = sum;
        boolean[] used = new boolean[nums.length];
        return getSubArr(nums, target, used, 0, 0);
    }

    // 保留每个子集的总和
    int avg;
    int all;

    /**
     * 从第index个开始接着寻找
     */
    private boolean getSubArr(int[] nums, int target, boolean[] used, int sum, int index) {
        if (target > all) {
            return true;
        }
        boolean res = false;
        // 从第index个开始接着寻找
        for (int j = index; j < nums.length; j++) {
            // 没被用过，则尝试使用
            if (!used[j]) {
                used[j] = true;
                if (sum + nums[j] < target) {
                    // 接着去寻找之后的数字中是否有合适的。
                    res = getSubArr(nums, target, used, sum + nums[j], j + 1);
                } else if (sum + nums[j] == target) {
                    // 目标值由 1 个avg 变为 2个avg，2->3,3->4, k-1 ->k .以此类推
                    res = getSubArr(nums, target + avg, used, sum + nums[j], 0);
                }
                if (res) {
                    return true;
                }
                used[j] = false;
            }
        }
        return res;
    }
}
