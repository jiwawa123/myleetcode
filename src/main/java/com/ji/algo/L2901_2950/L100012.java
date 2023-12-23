package com.ji.algo.L2901_2950;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/11/26/13:21
 */
public class L100012 {
    public static void main(String[] args) {

    }

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new LinkedList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(x + "")) {
                res.add(i);
            }
        }

        return res;
    }
}
