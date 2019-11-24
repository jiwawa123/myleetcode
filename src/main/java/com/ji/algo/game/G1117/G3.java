package com.ji.algo.game.G1117;/*
    user ji
    data 2019/11/17
    time 10:59 AM
*/

import java.util.ArrayList;
import java.util.List;

public class G3 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 4};
        System.out.println(new G3().maxSumDivThree(arr));
    }

    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        List<Integer> list = new ArrayList();
        for (int k : nums
                ) {
            if (k % 3 == 0) {
                sum += k;
            } else {
                list.add(k);
            }
        }
        if (list.size() == 0)
            return sum;
        return sum + help(list);
    }

    public int help(List<Integer> list) {
        int dp[][] = new int[3][list.size()];
        for (int i = 0; i < list.size(); i++) {
            int tmp = list.get(i) % 3;
            if (i == 0) {
                dp[tmp][i] = list.get(i);
                continue;
            }
            //0
            int k = list.get(i) + dp[0][i - 1];
            dp[(list.get(i) + dp[0][i - 1]) % 3][i] =
                    Math.max(dp[(list.get(i) + dp[0][i - 1]) % 3][i - 1], k);
            //1
            int k1 = list.get(i) + dp[1][i - 1];
            dp[(list.get(i) + dp[1][i - 1]) % 3][i] =
                    Math.max(dp[(list.get(i) + dp[1][i - 1]) % 3][i - 1], k1);
            //2
            int k2 = list.get(i) + dp[2][i - 1];
            dp[(list.get(i) + dp[2][i - 1]) % 3][i] =
                    Math.max(dp[(list.get(i) + dp[2][i - 1]) % 3][i - 1], k2);
            for (int j = 0; j < 3; j++) {
                dp[j][i] = Math.max(dp[j][i-1],dp[j][i]);
            }
        }
        return dp[0][list.size() - 1];
    }
}
