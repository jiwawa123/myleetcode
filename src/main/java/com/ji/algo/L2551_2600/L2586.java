package com.ji.algo.L2551_2600;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2023/03/24/下午8:29
 */
public class L2586 {
    public static void main(String[] args) {

    }

    public int vowelStrings(String[] words, int left, int right) {
        Set<Character> set = new HashSet<>();
        char[] chars = {'a', 'e', 'i', 'o', 'u'};
        for (char a : chars
        ) {
            set.add(a);
        }
        int res = 0;
        for (int i = left; i <= right && i < words.length; i++) {
            int len = words[i].length() - 1;
            if (set.contains(words[i].charAt(0)) && set.contains(words[i].charAt(len))) {
                res++;
            }
        }
        return res;
    }
}
