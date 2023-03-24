package com.ji.algo.L2551_2600;

/**
 * @Author: Bei Chang
 * @Date: 2023/02/19/下午5:46
 */
public class L2562 {
    public static void main(String[] args) {
        int[] arr = {5, 14, 13, 8, 12};
        System.out.println(findTheArrayConcVal(arr));
    }

    public static long findTheArrayConcVal(int[] nums) {
        long res = 0;
        int i = 0, j = nums.length - 1;
        while (i < j) {
            String tmp = nums[i] + "" + nums[j];
            res += Integer.valueOf(tmp);
            i++;
            j--;
        }
        if (i == j) {
            res += nums[i];
        }
        return res;
    }
}
