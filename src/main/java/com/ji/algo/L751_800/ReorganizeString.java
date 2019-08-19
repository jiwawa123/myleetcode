package com.ji.algo.L751_800;/*
    user ji
    data 2019/8/19
    time 9:43 AM
*/

public class ReorganizeString {
    public static void main(String[] args) {
        System.out.println(reorganizeString("aaabb"));
    }

    public static String reorganizeString(String S) {
        if (S.length() == 1)
            return S;
        int arr[] = new int[26];
        int max = 0;
        for (int i = 0; i < S.length(); i++) {
            arr[S.charAt(i) - 'a'] += 1;
            max = Math.max(arr[S.charAt(i) - 'a'], max);
        }
        if (max > (S.length() + 1) / 2) {
            return "";
        }
        StringBuilder sp = new StringBuilder();
        while (sp.length() < S.length()) {
            int f = 0, s = 0;
            int i1 = -1, i2 = -1;
            boolean f1 = false;
            boolean s2 = false;
            for (int i = 0; i < 26; i++) {
                if (arr[i] > f) {
                    if (f > 0) {
                        s = f;
                        s2 = true;
                        i2 = i1;
                    }
                    f = arr[i];
                    i1 = i;
                    f1 = true;
                } else {
                    if (arr[i] > s) {
                        s = arr[i];
                        s2 = true;
                        i2 = i;
                    }
                }

            }
            sp.append((char) ('a' + i1));
            arr[i1] -= 1;
            if (s2) {
                sp.append((char) ('a' + i2));
                arr[i2] -= 1;
            }
            if (!s2) {
                break;
            }
        }
        return sp.toString();
    }
}
