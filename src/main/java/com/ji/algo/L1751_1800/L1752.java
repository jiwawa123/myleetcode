package com.ji.algo.L1751_1800;

/**
 * user ji
 * data 2021/2/12
 * time 9:54 下午
 */
public class L1752 {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3};
        System.out.println(check(arr));
    }

    public static boolean check(int[] nums) {
        int max1 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE, min2 = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] < nums[i - 1]) {
                count++;
                if (count >= 2)
                    return false;
            }
            if (count >= 1) {
                min2 = Math.min(min2, nums[i]);
                max2 = Math.max(max2, nums[i]);
            } else {
                min1 = Math.min(min1, nums[i]);
                max1 = Math.max(max1, nums[i]);
            }

        }
        if (count < 1)
            return true;
        if (max2 > max1 || min2 > min1)
            return false;
        if (max2 > min1 && max2 < max1)
            return false;

        return true;
    }
}
