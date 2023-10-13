package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/08/21:54
 */
public class L415 {
    public static void main(String[] args) {

    }

    public String addStrings(String num1, String num2) {
        StringBuilder sp = new StringBuilder();
        int now = 0;
        int i = num1.length() - 1, j = num2.length() - 1;
        while (i >= 0 && j >= 0) {
            int t = (now + num1.charAt(i) - '0' + num2.charAt(j) - '0') % 10;
            now = (now + num1.charAt(i) - '0' + num2.charAt(j) - '0') / 10;
            sp.append(t);
            i--;
            j--;

        }

        while (i >= 0) {
            int t = (now + num1.charAt(i) - '0') % 10;
            now = (now + num1.charAt(i) - '0') / 10;
            sp.append(t);
            i--;

        }

        while (j >= 0) {
            int t = (now + num2.charAt(j) - '0') % 10;
            now = (now + num2.charAt(j) - '0') / 10;
            sp.append(t);
            j--;
        }

        if (now > 0) {
            sp.append(now);
        }

        return sp.reverse().toString();
    }
}
