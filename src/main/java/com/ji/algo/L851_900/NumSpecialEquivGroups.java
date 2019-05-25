package com.ji.algo.L851_900;/*
    user ji
    data 2019/5/25
    time 8:56 AM
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumSpecialEquivGroups {
    public static void main(String[] args) {
        String arr[] = {"abcd", "cdab", "cbad", "xyzz", "zzxy", "zzyx"};
        System.out.println(numSpecialEquivGroups(arr));
    }

    public static int numSpecialEquivGroups(String[] A) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i].length() < 2)
                map.put(A[i], 0);
            else {
                String tmp = "";
                StringBuilder sp = new StringBuilder();
                for (int j = 0; j < A[i].length(); j += 2) {
                    sp.append(A[i].charAt(j));
                }
                char[] tp = sp.toString().toCharArray();
                Arrays.sort(tp);
                tmp += String.valueOf(tp);
                sp = new StringBuilder();
                for (int j = 1; j < A[i].length(); j+=2) {
                    sp.append(A[i].charAt(j));
                }
                tp = sp.toString().toCharArray();
                Arrays.sort(tp);
                tmp += String.valueOf(tp);
                map.put(tmp, 0);
            }
        }
        return map.size();
    }
}
