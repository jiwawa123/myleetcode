package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/03/09:10
 */
public class L125 {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            boolean l = true, r = true;
            if (!isChar(s.charAt(left))) {
                left++;
                l = false;
            }
            if (!isChar(s.charAt(right))) {
                right--;
                r = false;
            }

            if (l && r) {
                if (s.charAt(left++) != s.charAt(right--)) {
                    return false;
                }
            }
        }


        return true;
    }

    public boolean isChar(char a) {
        return (a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') || (a >= '0' && a <= '9');
    }
}
