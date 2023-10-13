package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/03/07:57
 */
public class L392 {
    public static void main(String[] args) {

    }


    public boolean isSubsequence(String s, String t) {
        int left = 0, right = 0;
        if (t == null && s == null) {
            return true;
        }

        if (t.length() > s.length()) {
            return false;
        }

        while (left < s.length() && right < t.length()) {
            if (s.charAt(left) == t.charAt(right)) {
                left++;
                right++;
            } else {
                left++;
            }
        }

        return right == t.length();
    }
}
