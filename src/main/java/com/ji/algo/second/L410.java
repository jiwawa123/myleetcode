package com.ji.algo.second;

/**
 * user ji
 * data 2020/7/25
 * time 8:35 上午
 */
public class L410 {
    public static void main(String[] args) {
        int arr[] = {1, 4, 4};
        System.out.println(splitArray(arr, 3));
    }

    public static int splitArray(int[] nums, int m) {
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        long min = sum / m;

        long max = sum;


        while (min < max) {
            long med = (max - min) / 2 + min;
            if (isMeet(nums, m, med)) {
                max = med;
            } else {
                min = med + 1;
            }
        }

        return (int) max;

    }

    // 使用二分查找判断是否满足
    public static boolean isMeet(int[] nums, int m, long sum) {
        int count = 0;
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > sum)
                return false;
            if (tmp + nums[i] >= sum) {
                count++;
                tmp = nums[i];
            } else {
                tmp += nums[i];
            }
            if (count > m)
                return false;
        }
        return tmp <= sum && count + 1 <= m;
    }

}
