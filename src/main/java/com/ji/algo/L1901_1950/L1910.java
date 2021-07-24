package com.ji.algo.L1901_1950;

/**
 * user ji
 * data 2021/7/1
 * time 3:12 下午
 */
public class L1910 {
    public static void main(String[] args) {
        removeOccurrences("daabcbaabcbc","abc");
    }

    public static String removeOccurrences(String s, String part) {
        if (!s.contains(part))
            return s;
        int index = s.indexOf(part);
        return removeOccurrences(s.substring(0, index) + s.substring(index + part.length(), s.length()), part);
    }
}
