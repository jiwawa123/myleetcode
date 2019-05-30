package com.ji.algo.L701_750;/*
    user ji
    data 2019/5/30
    time 3:32 PM
*/

import java.util.*;

public class LongestWord {
    public static void main(String[] args) {
        String[] arr = {"vsw", "vs", "zwu", "vsx", "nc", "o", "vswus", "orv", "imf", "i", "v", "zw", "vs"};
        System.out.println(longestWord(arr));
    }

    public static String longestWord(String[] words) {

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], 1);
        }
        int max = -1;
        List<String> list = new ArrayList<>();
        for (int i = words.length - 1; i >= 0; i--) {
            int count = 0;
            int j = 0;
            for (; j < words[i].length(); j++) {
                if (map.containsKey(words[i].substring(0, j + 1))) {
                    count++;
                } else {
                    break;
                }
            }
            if (j != words[i].length())
                continue;
            if (count > max) {
                list = new ArrayList<>();
                list.add(words[i]);
                max = count;
            } else if (count == max) {
                if (!help_match(list.get(0), words[i])) {
                    list.set(0, words[i]);
                }
            }
        }
        return list.get(0);
    }

    public static boolean help_match(String a, String b) {
        int i = 0, j = 0;
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) < b.charAt(j))
                return true;
            if (a.charAt(i) > b.charAt(j))
                return false;
            i++;
            j++;

        }
        return a.length() < b.length();
    }
}
