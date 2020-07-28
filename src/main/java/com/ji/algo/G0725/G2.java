package com.ji.algo.G0725;

/**
 * user ji
 * data 2020/7/25
 * time 10:17 下午
 */
public class G2 {
    public static void main(String[] args) {
        int arr[] = { 7};
        System.out.println(numOfSubarrays(arr));
    }

    public static int numOfSubarrays(int[] arr) {
        long res = 0;
        int max = (int) Math.pow(10, 9) + 7;
        int dp[][] = new int[arr.length + 1][2];
        dp[0][0] = 0;
        dp[0][1] = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                dp[i + 1][1] = 1;
                dp[i + 1][1] += dp[i][1];
                dp[i + 1][0] = dp[i][0];
            } else {
                dp[i + 1][0] = 1;
                dp[i + 1][0] += dp[i][1];

                dp[i + 1][1] = dp[i][0];
            }
            System.out.println(dp[i + 1][0]);
            res += dp[i + 1][0];
            res %= max;
        }
        return (int) res % max;
    }



}
