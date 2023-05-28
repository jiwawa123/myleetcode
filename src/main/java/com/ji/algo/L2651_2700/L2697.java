package com.ji.algo.L2651_2700;

/**
 * @Author: Bei Chang
 * @Date: 2023/05/22/21:36
 */
public class L2697 {
    public static void main(String[] args) {

    }

    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char tmp = (char) ('a' + Math.min(arr[i] - 'a', arr[j] - 'a'));
            if (arr[i] != arr[j]) {
                arr[i] = tmp;
                arr[j] = tmp;
            }
            i++;
            j--;
        }
        return String.valueOf(arr);
    }
}
