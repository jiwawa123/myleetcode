package com.ji.algo.L2451_2500;

/**
 * @Author: Bei Chang
 * @Date: 2022/12/25/上午10:50
 */
public class L2486 {
    public static void main(String[] args) {

    }

    public int appendCharacters(String s, String t) {
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(l)) {
                l++;
                if (l == t.length()) {
                    break;
                }
            }
        }
        return t.length() - l;
    }
}
