package com.ji.algo.G0809;

/**
 * user ji
 * data 2020/8/9
 * time 2:10 下午
 */
public class G {
    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode"));
    }

    public static String makeGood(String s) {
        if (s == null || s.equals("")) {
            return s;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (Math.abs(s.charAt(i) - s.charAt(i + 1)) == 32) {
                return makeGood(s.substring(0, i) + s.substring(i + 2, s.length()));
            }
        }
        return s;
    }
}
