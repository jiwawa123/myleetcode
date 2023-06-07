package com.ji.algo.L2701_2750;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/06/08:46
 */
public class L2717 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3};
        System.out.println(semiOrderedPermutation(arr));
    }

    public static int semiOrderedPermutation(int[] nums) {
        int count = 0;
        // 找到1的位置
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                while (i > 0) {
                    int tmp = nums[i - 1];
                    nums[i] = tmp;
                    nums[i - 1] = 1;
                    i--;
                    count++;
                }
                break;
            }
        }
        // 找到n的位置
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums.length) {
                while (i < nums.length - 1) {
                    int tmp = nums[i + 1];
                    nums[i] = tmp;
                    nums[i + 1] = nums.length;
                    i++;
                    count++;
                }
                break;
            }
        }
        return count;


    }
}
