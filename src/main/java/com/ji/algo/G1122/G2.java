package com.ji.algo.G1122;

/**
 * user ji
 * data 2020/11/22
 * time 7:12 下午
 */
public class G2 {
    public static void main(String[] args) {
        int arr[] = {4, 1, 1, 2, 5, 1, 5, 4};
        System.out.println(waysToMakeFair(arr));
    }

    public static int waysToMakeFair(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int f = 0, s = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j < i) {
                    if (j % 2 == 0) {
                        f += nums[j];
                    } else {
                        s += nums[j];
                    }
                    continue;
                }
                if (j > i) {
                    if ((i % 2 == 0 && (j - i) % 2 == 1) || (i % 2 == 1 && (j - i) % 2 == 0)) {
                        f += nums[j];
                    } else {
                        s += nums[j];
                    }
                }
            }

            if (s == f)
                count++;
        }
        return count;
    }
}
