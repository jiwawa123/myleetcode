package com.ji.algo.L51_100;/*
    user ji
    data 2019/8/24
    time 8:03 PM
*/

public class MinDistance {
    public static void main(String[] args) {

    }

    public int minDistance(String word1, String word2) {
        int dp[][] = new int[word2.length() + 1][word1.length() + 1];
        for (int i = 0; i <= dp.length; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = i;
        }
        for (int i = 0; i < word2.length(); i++) {
            for (int j = 0; j < word1.length(); j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    int x = i + 1;
                    int y = j + 1;
                    int min = Math.min(dp[x - 1][y], dp[x][y - 1]);
                    min = Math.min(dp[x - 1][y - 1], min);
                    dp[x][y] = min;
                } else {
                    int x = i + 1;
                    int y = j + 1;
                    int min = Math.min(dp[x - 1][y], dp[x][y - 1]);
                    min = Math.min(dp[x - 1][y - 1], min);
                    dp[x][y] = min + 1;
                }
            }
        }
        return dp[word2.length()][word1.length()];
    }
}
