package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/12/22:21
 */
public class LO53 {
    public static void main(String[] args) {

    }

    public int search(int[] nums, int target) {

        int index = get(nums, target);
        if (index == -1) {
            return 0;
        }
        int res = 1;

        int i = index - 1, j = index + 1;
        while (i >= 0 && nums[i] == target) {
            res++;
            i--;
        }
        while (j < nums.length && nums[j] == target) {
            res++;
            j--;
        }
        return res;


    }

    public int get(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int med = (j + i) / 2;
            if (nums[med] == target) {
                return med;
            } else if (nums[med] < target) {
                i = med + 1;
            } else {
                j = med - 1;
            }
        }
        return -1;
    }

}
