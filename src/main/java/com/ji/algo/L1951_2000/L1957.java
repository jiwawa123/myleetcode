package com.ji.algo.L1951_2000;

/**
 * @author ji
 * @data 2021/8/29
 * @time 9:01 下午
 */
public class L1957 {
    public static void main(String[] args) {

    }

    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int len = 1;
        char t = s.charAt(0);
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                len++;
            } else {
                t = s.charAt(i);
                len = 1;
            }
            if (len <= 3) {
                sb.append(t);
            }
        }

        return sb.toString();
    }
}
