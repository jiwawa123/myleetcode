package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/21
    time 9:06 PM
*/

public class ContainsDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        containsDuplicate(arr);
    }

    public static boolean containsDuplicate(int[] nums) {
        int tmp;
        for (int i = 1; i < nums.length; i++) {
            tmp = nums[i];
            for (int j = i - 1; j > -1; j--) {
                if (tmp == nums[j]) {
                    return true;
                } else if (tmp < nums[j]) {
                    nums[j + 1] = nums[j];
                    if (j == 0) {
                        nums[j] = tmp;
                    }
                } else {
                    nums[j + 1] = tmp;
                    break;
                }
            }
        }
        return false;
    }
}
