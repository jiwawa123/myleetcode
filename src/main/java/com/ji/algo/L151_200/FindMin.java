package com.ji.algo.L151_200;/*
    user ji
    data 2019/4/15
    time 11:18 PM
*/

public class FindMin {
    public static void main(String[] args) {
        int arr[] = {1, 2};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int med = (i + j) / 2;
            if (nums[med] > nums[med + 1]) {
                return nums[med + 1];
            }
            if (med > 0 && med < nums.length - 1) {
                if (nums[med] < nums[med - 1] && nums[med] < nums[med + 1])
                    return nums[med];
            }
            if (nums[j] < nums[med]) {
                i = med + 1;
                continue;
            } else {
                j = med - 1;
            }

        }
        return nums[i];
    }
}
