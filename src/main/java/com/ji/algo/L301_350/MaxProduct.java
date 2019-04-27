package com.ji.algo.L301_350;/*
    user ji
    data 2019/4/27
    time 1:19 PM
*/

import java.util.*;

public class MaxProduct {
    public static void main(String[] args) {

    }

    public int maxProduct(String[] words) {
        if (words == null || words.length < 2)
            return 0;
        int max = 0;
        List<String> tmp = Arrays.asList(words);
        Collections.sort(tmp, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        for (int i = 0; i < tmp.size(); i++) {
            int len = tmp.get(i).length();
            if (len * len < max)
                break;
            for (int j = i + 1; j < tmp.size(); j++) {
                int len1 = tmp.get(j).length();
                if (len * len1 < max)
                    break;
                if (isNoShare(tmp.get(i), tmp.get(j))) {
                    max = Math.max(len*len1,max);
                }
            }
        }
        return max;
    }

    public boolean isNoShare(String a, String b) {
        int arr[] = new int[26];
        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < b.length(); i++) {
            if (arr[b.charAt(i) - 'a'] > 0)
                return false;
        }
        return true;
    }
}
