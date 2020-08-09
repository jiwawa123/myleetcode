package com.ji.algo.rob;

/**
 * user ji
 * data 2020/8/5
 * time 8:01 上午
 */
public class RobAbout {
    public static void main(String[] args) {
        int arr[] = {2, 3, 2};
        int arr1[] = {2, 7, 9, 3, 1};
        System.out.println(robII(arr));
    }

    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int s = nums[0];
        if (nums.length < 2)
            return s;
        int f = nums[1];
        for (int i = 2; i < nums.length; i++) {
            int tmp = Math.max(s + nums[i], f);
            s = Math.max(s, f);
            f = tmp;
        }

        return Math.max(s, f);

    }


    public static int robII(int[] nums) {
        int tmp[] = new int[nums.length - 1];
        int tmpII[] = new int[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            tmp[i] = nums[i];
            tmpII[i] = nums[i + 1];
        }
        return Math.max(rob(tmp), rob(tmpII));
    }
}
