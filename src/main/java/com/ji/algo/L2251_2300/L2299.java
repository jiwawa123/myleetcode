package com.ji.algo.L2251_2300;

/**
 * @Author: Bei Chang
 * @Date: 2022/07/18/下午9:44
 */
public class L2299 {
    public static void main(String[] args) {

    }

    public boolean strongPasswordCheckerII(String password) {
        if (password == null) {
            return false;
        }
        boolean s = true, n = false, l = false, up = false;
        char[] chars = password.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i > 0 && chars[i] == chars[i - 1]) {
                return false;
            }

            if (chars[i] <= 'z' && chars[i] >= 'a') {
                l = true;
                continue;
            }
            if (chars[i] <= 'Z' && chars[i] >= 'A') {
                up = true;
                continue;
            }
            if (chars[i] <= '9' && chars[i] >= '0') {
                n = true;
                continue;
            }

            if ("!@#$%^&*()-+".contains(chars[i] + "")) {
                s = true;
                continue;
            }

        }
        return chars.length >= 8 && n && l && up && s;
    }
}
