package com.ji.algo.L201_250;/*
    user ji
    data 2019/9/27
    time 4:49 PM
*/

public class L268 {
    public static void main(String[] args) {
        int arr[] = {2, 0};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int index = -nums[i] - 1;
                if (index >= nums.length)
                    continue;
                nums[index] *= -1;
                nums[index] -= 1;
            } else {
                if (nums[i] >= nums.length)
                    continue;
                nums[nums[i]] = nums[nums[i]] * -1 - 1;

            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                return i;
            }
        }
        return nums.length;
    }
}
