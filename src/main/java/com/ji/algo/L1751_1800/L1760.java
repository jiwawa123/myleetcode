package com.ji.algo.L1751_1800;

import java.util.Arrays;

/**
 * user ji
 * data 2021/2/24
 * time 9:24 上午
 */
public class L1760 {
    public static void main(String[] args) {
        int arr[] = {9};
        System.out.println(minimumSize(arr, 2));
    }

    public static int minimumSize(int[] nums, int maxOperations) {
        int lo = 1, hi = 1000000000;
        int ans = 0;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            // 计算需要的操作次数
            int ops = 0;
            for (int num : nums) {
                if (num <= mid)
                    continue;
                if (num % mid == 0)
                    ops += num/mid - 1;
                else
                    ops += num / mid;
            }
            //System.out.println(mid + " ops:" + ops);
            if (ops <= maxOperations) { // 可以完成
                ans = mid;
                hi = mid;
            } else { // 不能完成
                lo = mid + 1;
            }

        }
        return ans;
    }
}
