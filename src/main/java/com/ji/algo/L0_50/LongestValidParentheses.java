package com.ji.algo.L0_50;/*
    user ji
    data 2019/8/23
    time 8:45 PM
*/

import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses("()(())"));
    }

    public static int longestValidParentheses(String s) {
        if (s == null || s.length() < 2)
            return 0;
        int max = 0;
        int count = 0;
        int dp[] = new int[s.length()];
        dp[0] = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                dp[i] = 0;
                count = 0;
                stack.push('(');
            } else {
                if (stack.isEmpty()) {
                    dp[i] = 0;
                } else {
                    stack.pop();
                    count += 2;
                    dp[i] = dp[Math.max(0, i - count)] + count;
                    count = dp[i];
                    max = Math.max(dp[i], max);
                }
            }
        }
        return max;
    }
}
