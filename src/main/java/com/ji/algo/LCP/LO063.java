package com.ji.algo.LCP;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/10/17:35
 */
public class LO063 {
    public static void main(String[] args) {

    }

    public String replaceWords(List<String> dictionary, String sentence) {
        Collections.sort(dictionary, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        StringBuilder sp = new StringBuilder();
        String[] str = sentence.split(" ");
        for (String sen : str
        ) {
            boolean f = false;
            for (String s : dictionary
            ) {
                if (sen.startsWith(s)) {
                    sp.append(s + " ");
                    f = true;
                    break;
                }
            }
            if (!f) {
                sp.append(sen + " ");
            }
        }
        return sp.toString().trim();
    }
}
