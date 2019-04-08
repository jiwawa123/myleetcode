package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/8
    time 9:40 PM
*/

import java.util.Arrays;

public class StrStr {
    public static void main(String[] args) {
        int[] k = help_next("hehe");
        System.out.println(Arrays.toString(k));
    }
    //自己实现kmp算法
    public int strStr(String s, String t) {
        if (null == t || t.equals(""))
            return 0;
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        int[] next = help_next(s);
        int i = 0, j = 0;
        while (i < s_arr.length && j < t_arr.length) {
            if (j == -1 || s_arr[i] == t_arr[j]) {
                i++;
                j++;
            } else
                j = next[j];
        }
        if (j == t_arr.length)
            return i - j;
        else
            return -1;
    }

    public static int[] help_next(String str) {
        int[] re = new int[str.length()];
        re[0] = -1;
        re[1] = 0;
        for (int i = 2; i < str.length(); i++) {
            int k = re[i - 1];
            while (k != -1 && str.charAt(i - 1) != str.charAt(k)) {
                k = re[k];
            }
            re[i] = k == -1 ? 0 : k + 1;
        }
        return re;
    }
}
