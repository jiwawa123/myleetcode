package com.ji.algo.L651_700;/*
    user ji
    data 2019/6/20
    time 9:50 AM
*/

public class FindLengthOfLCIS {
    public static void main(String[] args) {

    }

    public int findLengthOfLCIS(int[] nums) {
        int len = 0;
        int i = 0;
        int tmp = 0;
        while (i < nums.length) {
            if (tmp == 0) {
                tmp++;
                len = Math.max(len, tmp);
                i++;
                continue;
            }
            if (i > 0 && nums[i] > nums[i - 1]) {
                tmp++;
                len = Math.max(len, tmp);
            } else {
                tmp = 1;
            }
            i++;
        }
        return len;
    }
}
