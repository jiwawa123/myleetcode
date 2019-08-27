package com.ji.algo.L801_850;/*
    user ji
    data 2019/8/26
    time 10:45 PM
*/

import java.util.*;

public class ExpressiveWords {
    public static void main(String[] args) {
        int k = 1;
        ExpressiveWords word = new ExpressiveWords();
        String tmp[] = {"dinnssoo", "ddinso", "ddiinnso", "ddiinnssoo", "ddiinso", "dinsoo", "ddiinsso", "dinssoo", "dinso"};
        System.out.println(word.expressiveWords("dddiiiinnssssssoooo", tmp));
    }

    Map<Character, Integer> map;
    List<Character> list = new ArrayList<>();
    List<Integer> count = new ArrayList<>();
    int len;

    public int expressiveWords(String S, String[] words) {
        map = new HashMap<>();
        len = S.length();
        for (int i = 0; i < S.length(); i++) {
            map.put(S.charAt(i), 1);
        }
        int k = 0;
        while (k < S.length()) {
            char a = S.charAt(k);
            list.add(a);
            int sum = 1;
            while (k < S.length()) {
                ++k;
                if (k < S.length()) {
                    if (S.charAt(k) == a) {
                        sum++;
                    } else {
                        break;
                    }
                }
            }
            count.add(sum);

        }
        int all = 0;
        for (int i = 0; i < words.length; i++) {
            all += first(words[i]) ? 1 : 0;
        }
        return all;
    }

    public boolean first(String tmp) {
        if (tmp.length() > len)
            return false;
        int i = 0, j = 0;
        while (i < tmp.length() && j < list.size()) {
            char a = tmp.charAt(i);
            if (a != list.get(j))
                return false;
            int sum = 1;
            while (i < tmp.length()) {
                i++;
                if (i < tmp.length()) {
                    if (tmp.charAt(i) == a) {
                        sum++;
                    } else {
                        break;
                    }
                }
            }
            if (sum > count.get(j))
                return false;
            if (sum == count.get(j) || sum >= 3) {
                j++;
                continue;
            }

            return false;

        }
        return i == tmp.length() && j == list.size();

    }
}
