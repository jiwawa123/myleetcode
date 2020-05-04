package com.ji.algo.G0504;

/**
 * user ji
 * data 2020/5/4
 * time 8:59 上午
 */
public class kLengthApart {
    public static void main(String[] args) {

    }

    public boolean kLengthApart(int[] nums, int k) {
        int last = k;
        int index = 0;
        while (index < nums.length) {
            if (nums[index] == 1) {
                if (last < k)
                    return false;
                last = 0;
            } else {
                last++;
            }
        }

        return true;
    }
}
