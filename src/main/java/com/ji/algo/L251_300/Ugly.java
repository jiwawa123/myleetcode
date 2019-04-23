package com.ji.algo.L251_300;/*
    user ji
    data 2019/4/23
    time 8:07 PM
*/

public class Ugly {
    public static void main(String[] args) {

    }

    public boolean isUgly(int num) {
        if (num <= 0)
            return false;
        while (num % 2 == 0)
            num /= 2;
        while (num % 3 == 0)
            num /= 3;
        while (num % 5 == 0)
            num /= 5;
        return num == 1;
    }
    public int nthUglyNum(int n){
        if (n < 0) {
            return 0;
        }
        int[] nums = new int[n];
        nums[0] = 1;
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;
        int i = 1;
        while (i < n) {
            int min = Math.min(Math.min(nums[p2] * 2, nums[p3] * 3), nums[p5] * 5);
            if (min == nums[p2] * 2) {
                p2++;
            } else if (min == nums[p3] * 3) {
                p3++;
            } else {
                p5++;
            }
            if (min != nums[i - 1]) {
                nums[i++] = min;
            }
        }
        return nums[n - 1];
    }
}
