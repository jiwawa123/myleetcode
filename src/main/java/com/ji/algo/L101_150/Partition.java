package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/15
    time 3:31 PM
*/

import java.util.ArrayList;
import java.util.List;

public class Partition {
    public static void main(String[] args) {
        new Partition().partition("aab");
    }

    List<List<String>> list;

    public List<List<String>> partition(String s) {
        list = new ArrayList<>();
        if (s == null || s.equals(""))
            return list;
        List<String> tmp = new ArrayList<>();
        help_part(tmp,"",0,s);
        return list;
    }

    public void help_part(List<String> tmp, String ss, int len, String s) {
        if (len == s.length()) {
            list.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = len; i < s.length(); i++) {
            String stmp = s.substring(len, i+1);
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
