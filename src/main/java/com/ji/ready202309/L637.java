package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/12/21:55
 */
public class L637 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2, 3, 3, 3};
        System.out.println(findNumberOfLIS(arr));
    }

    public static int findNumberOfLIS(int[] nums) {
        int max = 0;
        int[] res = new int[nums.length];
        int[] cou = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                res[i] = 1;
                cou[i] = 1;
            } else {
                res[i] = 1;
                int len = 1;
                for (int j = i - 1; j >= 0; j--) {
                    if (nums[i] > nums[j]) {
                        if (1 + res[j] > res[i]) {
                            res[i] = 1 + res[j];
                            len = cou[j];
                        } else if (1 + res[j] == res[i]) {
                            len += cou[j];
                        }
                    }
                }
                cou[i] = len;

            }
            max = Math.max(max, res[i]);
        }

        int count = 0;
        for (int i = 0; i < res.length; i++) {
            if (max == nums[i]) {
                count += cou[i];
            }
        }
        return count;
    }
}
