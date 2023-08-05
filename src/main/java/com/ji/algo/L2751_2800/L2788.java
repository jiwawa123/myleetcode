package com.ji.algo.L2751_2800;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/07/29/10:32
 */
public class L2788 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("one.two.three.four.five");
        splitWordsBySeparator(list, '.');
    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new LinkedList<>();
        for (String word : words
        ) {
            StringBuilder sp = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == separator) {
                    if (sp.length() > 0) {
                        list.add(sp.toString());
                        sp = new StringBuilder();
                    }
                } else {
                    sp.append(word.charAt(i));
                }
            }
            if (sp.length() > 0) {
                list.add(sp.toString());
            }

        }
        return list;
    }
}
