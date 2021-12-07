package com.ji.algo.L2051_2100;

/**
 * @author ji
 * @data 2021/12/7
 * @time 10:43 下午
 */
public class L2057 {
    public static void main(String[] args) {

    }
    public int smallestEqual(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(i%10==nums[i])
                return i;
        }
        return -1;
    }
}
