package com.ji.algo.second;

/**
 * user ji
 * data 2020/8/24
 * time 8:58 上午
 */
public class L459 {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("ab"));
    }

    public static boolean repeatedSubstringPattern(String s) {
        if (s == null || s.length() < 2)
            return false;
        StringBuilder sp = new StringBuilder();
        for (int i = 0; i < s.length() / 2 ; i++) {
            sp.append(s.charAt(i));
            if (s.length() % sp.length() != 0) {
                continue;
            }
            boolean flag = true;
            for (int j = 0; j < s.length(); j += sp.length()) {
                if (!s.substring(j, j + sp.length()).equals(sp.toString())) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return true;
        }


        return false;
    }
}
