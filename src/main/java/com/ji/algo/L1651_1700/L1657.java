package com.ji.algo.L1651_1700;

import java.util.Arrays;

/**
 * user ji
 * data 2021/1/29
 * time 10:32 上午
 */
public class L1657 {
    public static void main(String[] args) {

    }

    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;
        int arr1[] = new int[26];
        int arr2[] = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            arr1[word1.charAt(i) - 'a'] += 1;
            arr2[word2.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < 26; i++) {
            if ((arr1[i] == 0) ^ (arr2[i] == 0))
                return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
}
