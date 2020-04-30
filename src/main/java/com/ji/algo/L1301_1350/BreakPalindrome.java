package com.ji.algo.L1301_1350;

/**
 * user ji
 * data 2020/4/30
 * time 8:53 上午
 */
public class BreakPalindrome {
    public static void main(String[] args) {
        System.out.println(breakPalindrome("aa"));
    }

    public static String breakPalindrome(String palindrome) {
        if (palindrome.length() < 2)
            return "";
        char[] arr = palindrome.toCharArray();
        boolean tmp = arr.length % 2 != 0;
        boolean flag = false;
        for (int i = 0; i < palindrome.length(); i++) {
            if (tmp && i == arr.length / 2) {
                continue;
            }
            if (arr[i] != 'a') {
                arr[i] = 'a';
                flag = true;
                break;
            }
        }
        if (!flag) {
            arr[arr.length - 1] = 'b';
        }
        return String.valueOf(arr);
    }
}
