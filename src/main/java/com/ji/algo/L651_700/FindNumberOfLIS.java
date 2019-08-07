package com.ji.algo.L651_700;/*
    user ji
    data 2019/8/7
    time 5:08 PM
*/

public class FindNumberOfLIS {
    public static void main(String[] args) {
        int arr[] = {1,3,5,4,7};
        System.out.println(findNumberOfLIS(arr));
    }

    public static  int findNumberOfLIS(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int arr[] = new int[nums.length];
        int len[] = new int[nums.length];
        arr[0] = 1;
        len[0] = 1;
        int alllen = 1;
        for (int i = 1; i < nums.length; i++) {
            int dep = 1;
            int max = 1;
            for (int j = i - 1; j >= 0; j++) {
                if (nums[j] < nums[i]) {
                    if (dep < 1 + len[j]) {
                        dep = 1 + len[i];
                        max = arr[j];
                        continue;
                    }
                    if (dep == 1 + len[j])
                        max += arr[j];
                }
            }
            arr[i] = max;
            len[i] = dep;
            alllen = Math.max(alllen, len[i]);
        }
        int res = 0;
        for (int i = 0; i < len.length; i++) {
            if (len[i] == alllen)
                res += arr[i];
        }
        return res;
    }
}
