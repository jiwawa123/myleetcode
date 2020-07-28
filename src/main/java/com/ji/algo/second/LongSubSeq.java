package com.ji.algo.second;

/**
 * user ji
 * data 2020/7/27
 * time 8:41 上午
 */
public class LongSubSeq {
    public static void main(String[] args) {

    }

    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length())
            return false;
        if (s.length() == 0 && t.length() == 0) {
            return true;
        }

        if (s.length() == 0)
            return false;
        int s1 = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(s1)) {
                s1++;
            }

            if (s1 == s.length())
                return true;

            if (t.length() - i < s.length() - s1) {
                return false;
            }
        }


        return s1 == s.length();
    }
}
