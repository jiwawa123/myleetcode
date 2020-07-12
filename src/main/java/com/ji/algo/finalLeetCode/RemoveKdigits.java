package com.ji.algo.finalLeetCode;

/**
 * user ji
 * data 2020/7/3
 * time 3:32 下午
 */
public class RemoveKdigits {
    public static void main(String[] args) {

    }

    public String removeKdigits(String num, int k) {
        if (num.length() == k) return "0";
        StringBuilder s = new StringBuilder(num);
        for (int i = 0; i < k; i++) {
            int idx = 0;
            for (int j = 1; j < s.length() && s.charAt(j) >= s.charAt(j - 1); j++) idx = j;
            s.delete(idx, idx + 1);
            while (s.length() > 1 && s.charAt(0) == '0') s.delete(0, 1);
        }
        return s.toString();
    }
}
