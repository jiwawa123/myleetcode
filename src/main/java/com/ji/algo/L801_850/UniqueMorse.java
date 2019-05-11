package com.ji.algo.L801_850;/*
    user ji
    data 2019/5/11
    time 9:14 PM
*/

import java.util.HashMap;
import java.util.Map;

public class UniqueMorse {
    public static void main(String[] args) {

    }

    public int uniqueMorseRepresentations(String[] words) {
        String str[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Map<String, Integer> map = new HashMap();
        for (int i = 0; i < words.length; i++) {
            StringBuffer sp = new StringBuffer();
            for (int j = 0; j < words[i].length(); j++) {
                sp.append(str[words[i].charAt(j) - 'a']);
            }
            map.put(sp.toString(), 1);
        }
        return map.size();
    }

}
