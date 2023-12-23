package com.ji.algo.L2851_2900;

import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/30/08:46
 */
public class L2859 {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int res = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (isIndices(i, k)) {
                res += nums.get(i);
            }
        }
        return res;
    }

    public boolean isIndices(int index, int k) {
        int t = 0;
        while (index > 0) {
            t += index % 2 == 1 ? 1 : 0;
            index /= 2;
        }
        return t == k;
    }
}
