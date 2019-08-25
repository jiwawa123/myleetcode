package com.ji.algo.L851_900;/*
    user ji
    data 2019/8/25
    time 7:58 PM
*/

import java.util.HashMap;
import java.util.Map;

public class FindReplaceString {
    public static void main(String[] args) {

    }

    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        if (S == null || S.length() == 0 || sources == null || sources.length == 0)
            return S;
        StringBuilder sp = new StringBuilder();
        int i = 0;
        Map<Integer, String> map = new HashMap<>();
        Map<Integer,String> tar = new HashMap<>();
        for (int j = 0; j < sources.length; j++) {
            map.put(indexes[j],sources[j]);
            tar.put(indexes[j],targets[j]);
        }
        while (i < S.length()) {
            if (!map.containsKey(i)) {
                sp.append(S.charAt(i));
                i++;
            } else {
                int len = map.get(i).length();
                //单词过长
                if (i + len > S.length() || !S.substring(i, i + len).equals(map.get(i))) {
                    sp.append(S.charAt(i));
                    i++;
                    continue;
                } else {
                    sp.append(tar.get(i));
                    i += len;
                }
            }
        }
        return sp.toString();
    }
}
