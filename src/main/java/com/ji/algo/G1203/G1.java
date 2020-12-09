package com.ji.algo.G1203;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * user ji
 * data 2020/12/3
 * time 9:04 下午
 */
public class G1 {
    public static void main(String[] args) {
        System.out.println(compCount(3, 4));
    }

    public static int compCount(int m, int tmp) {
        
        int arr[] = {1, 3, 7, m};
        Arrays.sort(arr);
        int dp[] = new int[tmp + 1];
        dp[0] = 1;
        for (int i = 1; i < tmp + 1; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < arr.length; j++) {
                if (j > 0 && arr[j] == arr[j - 1])
                    continue;
                if (i - arr[j] >= 0 && !map.containsKey(i - arr[j]) && !map.containsKey(arr[j])) {
                    dp[i] += dp[i - arr[j]];
                    map.put(i - arr[j], 1);
                    map.put(arr[j], 1);
                }
            }
        }

        return dp[tmp];
    }

}
