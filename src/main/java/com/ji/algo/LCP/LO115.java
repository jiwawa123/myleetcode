package com.ji.algo.LCP;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/10/20:58
 */
public class LO115 {
    public static void main(String[] args) {
        String str = "abacdsa";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String tmp = String.valueOf(arr);
        System.out.println(tmp);
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new LinkedList<>();
        boolean[] f = new boolean[s.length()];
        char[] arr_p = p.toCharArray();
        Arrays.sort(arr_p);
        String pp = String.valueOf(arr_p);

        for (int i = 0; i < s.length() - p.length(); i++) {
            if (i > 0 && f[i - 1]) {
                if (s.charAt(i - 1) == s.charAt(i + p.length() - 1)) {
                    res.add(i);
                    f[i] = true;
                }
            } else {
                String tmp = pp.substring(i, i + p.length());
                char[] arr = tmp.toCharArray();
                Arrays.sort(arr);
                if (String.valueOf(arr).equals(pp)) {
                    res.add(i);
                    f[i] = true;
                }
            }
        }
        return res;
    }


}
