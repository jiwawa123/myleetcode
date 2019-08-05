package com.ji.algo.L101_150;/*
    user ji
    data 2019/8/5
    time 1:08 PM
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PartitionII {
    public static void main(String[] args) {

    }

    Set<List<String>> list = new HashSet<>();

    public List<List<String>> partition(String s) {
        if (s == null || s.length() == 0)
            return new ArrayList<>(list);
        help(s, new StringBuilder(), new ArrayList<>(), 0);
        return new ArrayList<>(list);
    }

    public void help(String s, StringBuilder kk, List<String> li, int index) {
        if (index == s.length()) {
            list.add(li);
            return;
        }
        for (int i = index; i < s.length(); i++) {
            kk.append(s.charAt(i));
            if (isP(kk)) {
                li.add(kk.toString());
                help(s, new StringBuilder(), new ArrayList<>(li), i + 1);
                li.remove(li.size() - 1);
            }
        }

    }

    public boolean isP(StringBuilder sp) {
        int i = 0, j = sp.length() - 1;
        while (i < j) {
            if (sp.charAt(i++) != sp.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
