package com.ji.algo.L751_800;/*
    user ji
    data 2019/5/10
    time 11:46 PM
*/

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    public static void main(String[] args) {
        letterCasePermutation("C");
    }

    public static List<String> letterCasePermutation(String S) {
        List<String> list = new ArrayList<>();
        String tmp1 = S.toLowerCase();
        String tmp2 = S.toUpperCase();
        for (int i = 0; i < S.length(); i++) {
            List<String> tmp = new ArrayList<>();
            if ((S.charAt(i) >= 'a' && S.charAt(i) <= 'z') || (S.charAt(i) >= 'A' && S.charAt(i) <= 'Z')) {
                if (list.isEmpty()) {
                    tmp.add("" + tmp1.charAt(i));
                    tmp.add("" + tmp2.charAt(i));
                } else {
                    for (int j = 0; j < list.size(); j++) {
                        tmp.add(list.get(j) + tmp1.charAt(i));
                        tmp.add(list.get(j) + tmp2.charAt(i));
                    }
                }
            } else {
                if (list.isEmpty()) {
                    tmp.add("" + S.charAt(i));
                } else {
                    for (int j = 0; j < list.size(); j++) {
                        tmp.add(list.get(j) + S.charAt(i));
                    }
                }

            }
            list = tmp;
        }
        return list;
    }
}
