package com.ji.algo.L401_450;/*
    user ji
    data 2019/9/28
    time 8:37 AM
*/

public class L414 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2};
        System.out.println(thirdMax(arr));
    }

    public static int thirdMax(int[] nums) {
        long f = Integer.MIN_VALUE;
        long s = Integer.MIN_VALUE;
        long t = Integer.MIN_VALUE;
        f -= 1;
        s -= 1;
        t -= 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == f || nums[i] == s || nums[i] == t)
                continue;
            if (nums[i] > f) {
                long tmp = f;
                long tmp1 = s;
                f = nums[i];
                if (tmp > s) {
                    s = tmp;
                    if (tmp1 > t) {
                        t = tmp1;
                    }
                }
                continue;
            }
            if (nums[i] > s) {
                long tmp = s;
                s = nums[i];
                if (tmp > t) {
                    t = tmp;
                }
                continue;
            }
            if (nums[i] > t) {
                t = nums[i];
            }
        }
        long res = Integer.MIN_VALUE;
        res -= 1;
        if (t == res)
            return (int) f;
        return (int) t;

    }
}
