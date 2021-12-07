package com.ji.algo.L2051_2100;

import java.util.*;

/**
 * @author ji
 * @data 2021/12/7
 * @time 10:46 下午
 */
public class L2062 {
    public static void main(String[] args) {
        System.out.println(countVowelSubstrings("aeiouu"));
    }

    public static int countVowelSubstrings(String word) {
        Character[] characters = new Character[]{'a', 'e', 'i', 'o', 'u'};
        Set<Character> set = new HashSet<>(Arrays.asList(characters));
        StringBuilder sp = new StringBuilder();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            Set<Character> tmp = new HashSet<>();
            if (set.contains(word.charAt(i))) {
                tmp.add(word.charAt(i));
                for (int j = i + 1; j < word.length(); j++) {
                    if (set.contains(word.charAt(j))) {
                        tmp.add(word.charAt(j));
                        if (tmp.size() == 5) {
                            count++;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return count;
    }
}
