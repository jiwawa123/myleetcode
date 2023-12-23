package com.ji.algo.L2851_2900;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/15/18:30
 */
public class L100000096 {
    public static void main(String[] args) {

    }

    public List<String> getWordsInLongestSubsequence(int n, String[] words, int[] groups) {
        List<String> res = new LinkedList<>();
        int now = -1;
        for (int i = 0; i < n; i++) {
            if (groups[i] != now) {
                now = groups[i];
                res.add(words[i]);
            }
        }

        return res;
    }
}
