package com.ji.algo.L2801_2850;

import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/08/24/20:36
 */
public class L2828 {
    public static void main(String[] args) {

    }

    public boolean isAcronym(List<String> words, String s) {
        int i = 0, j = 0;
        while (i < words.size() && j < s.length()) {
            if(words.get(i++).charAt(0)!=s.charAt(j++)){
                return false;
            }
        }
        return i == words.size() && j == s.length();
    }
}
