package com.ji.algo.L2351_2400;

/**
 * @Author: Bei Chang
 * @Date: 2022/08/14/下午3:27
 */
public class L2367 {
    public static void main(String[] args) {

    }

    public int arithmeticTriplets(int[] nums, int diff) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int len = nums[j] - nums[i];
                if (len > diff) {
                   break;
                }
                if(len==diff){
                    for (int k = j + 1; k < nums.length; k++) {
                        if (len == nums[k] - nums[j]) {
                            res++;
                        }
                        if (len < nums[k] - nums[j]) {
                            break;
                        }
                    }
                }

            }
        }
        return res;
    }
}
