package com.ji.algo.L2251_2300;

import java.util.*;

/**
 * @Author: Bei Chang
 * @Date: 2022/06/02/下午10:25
 */
public class L2273 {
    public static void main(String[] args) {

    }

    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        String last = null;
        for (int i = 0; i < words.length; i++) {
            char[] c = words[i].toCharArray();
            Arrays.sort(c);
            String str = String.valueOf(c);
            if (!str.equals(last)) {
                res.add(words[i]);
                last = str;
            }
        }
        return res;
    }
}
