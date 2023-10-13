package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/07/19:06
 */
public class L2024 {
    public static void main(String[] args) {

    }

    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(maxLen(answerKey, k, 'F'), maxLen(answerKey, k, 'T'));
    }

    public int maxLen(String answerKey, int k, char ch) {
        int res = 0;
        int sum = 0;
        for (int left = 0, right = 0; right < answerKey.length(); ) {
            sum += answerKey.charAt(right++) == ch ? 1 : 0;
            while (sum > k) {
                sum -= answerKey.charAt(left++) == ch ? 1 : 0;
            }
            res = Math.max(res, right - left);
        }


        return res;
    }
}
