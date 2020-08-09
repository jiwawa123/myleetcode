package com.ji.algo.second;

/**
 * user ji
 * data 2020/8/3
 * time 9:32 上午
 */
public class AddStrings {
    public static void main(String[] args) {

    }

    public String addStrings(String num1, String num2) {
        int next = 0;
        int i = num1.length() - 1, j = num2.length() - 1;
        StringBuilder sp = new StringBuilder();
        while (i >= 0 && j >= 0) {
            int t = (num1.charAt(i--) + num2.charAt(j--) - '0' - '0' + next);
            sp.append(t % 10);
            next = t / 10;
        }

        while (i >= 0) {
            int t = (num1.charAt(i--) - '0' + next);
            sp.append(t % 10);
            next = t / 10;
        }

        while (j >= 0) {
            int t = (num2.charAt(j--) - '0' + next);
            sp.append(t % 10);
            next = t / 10;
        }

        if (next > 0) {
            sp.append(next);
        }

        return sp.reverse().toString();
    }
}
