package com.ji.algo.L1751_1800;

/**
 * user ji
 * data 2021/2/22
 * time 8:51 下午
 */
public class L1768 {
    public static void main(String[] args) {

    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder sp = new StringBuilder();
        int i = 0, j = 0;
        boolean flag = true;
        while (i < word1.length() && j < word2.length()) {
            if (flag && i < word1.length()) {
                sp.append(word1.charAt(i++));
                flag = false;
                continue;
            }

            if (!flag && j < word2.length()) {
                sp.append(word2.charAt(j++));
                flag = true;
                continue;
            }

            if (i < word1.length())
                sp.append(i++);
            if (j < word2.length())
                sp.append(j++);

        }

        return sp.toString();
    }
}
