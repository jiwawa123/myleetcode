package com.ji.algo.L2951_3000;

/**
 * @Author: Bei Chang
 * @Date: 2024/04/04/15:45
 */
public class L2957 {
    public static void main(String[] args) {

    }

    public int removeAlmostEqualCharacters(String word) {
        int res = 0;
        for (int i = 1; i < word.length(); i++) {
            if (Math.abs(word.charAt(i - 1) - word.charAt(i)) <= 1) {
                res++;
                i++;
            }
        }
        return res;
    }
}
