package com.ji.algo.L251_300;/*
    user ji
    data 2019/4/23
    time 10:42 PM
*/

public class numSquare {
    public static void main(String[] args) {
        System.out.println(numSquares(12));
    }

    public static int numSquares(int n) {
        int arr[] = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            if (i <= 3) {
                arr[i] = i;
                continue;
            }
            if (isSqrt(i)) {
                arr[i] = 1;
                continue;
            }
            int min = Integer.MAX_VALUE;
            for (int j = i - 1; j >= i / 2; j--) {
                min = Math.min(min, arr[j] + arr[i - j]);
            }
            arr[i] = min;
        }
        return arr[n];
    }

    public static boolean isSqrt(int k) {
        return (int) Math.sqrt(k) * (int) Math.sqrt(k) == k;
    }
    public int numSquaresII(int n) {
        if(n<=3)
            return n;
        int[] dp =new int[n+1];

        //1=1;2=1+1;3=1+1+1
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        for(int i=4;i<=n;i++)
        {
            dp[i]=i;
            for(int t=1;i-t*t>=0;t++)
                dp[i]=Math.min(dp[i],dp[i-t*t]+1);
        }
        return dp[n];
    }

}
