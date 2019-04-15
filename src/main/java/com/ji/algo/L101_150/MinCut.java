package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/15
    time 3:52 PM
*/

import java.util.ArrayList;
import java.util.List;

public class MinCut {
    public static void main(String[] args) {

    }

    int min = Integer.MAX_VALUE;

    public int minCut(String s) {
        if (null == s || s.length() <= 1)
            return 0;
        List<String> tmp = new ArrayList<>();
        help_part(tmp, "", 0, s);
        return min;
    }

    public void help_part(List<String> tmp, String ss, int len, String s) {
        if (tmp.size() > min)
            return;
        if (len == s.length()) {
            min = Math.min(min, tmp.size());
        }
        for (int i = len; i < s.length(); i++) {
            String stmp = s.substring(len, i + 1);
            if (isPalindrome(stmp)) {
                tmp.add(stmp);
                help_part(tmp, stmp, i + 1, s);
                tmp.remove(tmp.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s) {
        if (null == s || s.length() == 0)
            return true;
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;
    }
}
