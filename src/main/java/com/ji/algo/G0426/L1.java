package com.ji.algo.G0426;

/**
 * user ji
 * data 2020/4/27
 * time 8:17 上午
 */
public class L1 {
    public static void main(String[] args) {
        System.out.println(maxScore("0011"));
    }

    public static int maxScore(String s) {
        int l[] = new int[s.length()];
        int r[] = new int[s.length()];
        int l1 = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                l1++;
            }
            l[i] = l1;
        }
        l1 = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            l1 += s.charAt(i) == '1' ? 1 : 0;
            r[i] = l1;
        }
        int res = 0;
        for (int i = 0; i < s.length() ; i++) {
            res = Math.max(res,l[i]+r[i]);
        }
        return res;
    }
}
