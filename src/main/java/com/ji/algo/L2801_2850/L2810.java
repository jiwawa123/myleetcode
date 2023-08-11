package com.ji.algo.L2801_2850;

/**
 * @Author: Bei Chang
 * @Date: 2023/08/11/20:48
 */
public class L2810 {
    public static void main(String[] args) {

    }

    public String finalString(String s) {
        StringBuilder sp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') {
                String tmp = sp.reverse().toString();
                sp = new StringBuilder();
                sp.append(tmp);
            } else {
                sp.append(s.charAt(i));
            }
        }
        return sp.toString();
    }
}
