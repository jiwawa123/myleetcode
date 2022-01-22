package com.ji.algo.offer;

/**
 * @Author: Bei Chang
 * @Date: 2022/01/22/下午10:03
 */
public class O34 {
    public static void main(String[] args) {
        O34 o34 = new O34();
        String[] arr = {"hello", "leetcode"};
        o34.isAlienSorted(arr, "hlabcdefgijkmnopqrstuvwxyz");
    }

    int[] arr = new int[26];

    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < order.length(); i++) {
            arr[order.charAt(i) - 'a'] = i;
        }
        for (int i = 1; i < words.length; i++) {
            if (!isSorted(words[i - 1], words[i])) {
                return false;
            }
        }
        return true;
    }

    public boolean isSorted(String w1, String w2) {
        int i = 0, j = 0;
        while (i < w1.length() && j < w2.length()) {
            if (arr[w1.charAt(i) - 'a'] > arr[w2.charAt(j) - 'a']) {
                return false;
            }
            if (arr[w1.charAt(i) - 'a'] < arr[w2.charAt(j) - 'a']) {
                return true;
            }
            i++;
            j++;
        }
        return i == w1.length();
    }
}
