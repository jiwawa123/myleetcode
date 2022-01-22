package com.ji.algo.L2101_2150;

/**
 * @Author: Bei Chang
 * @Date: 2022/01/22/下午5:30
 */
public class L2138 {
    public static void main(String[] args) {

    }

    public String[] divideString(String s, int k, char fill) {
        int len = s.length();
        int sLen = len / k;
        if (sLen * k != len) {
            sLen++;
        }
        String[] res = new String[sLen];
        int index = 0;
        for (int i = 0; i < sLen; i++) {
            StringBuilder sp = new StringBuilder();
            for (int j = 0; j < k; j++) {
                if (index < s.length()) {
                    sp.append(s.charAt(index++));
                } else {
                    sp.append(fill);
                }
            }
            res[i] = sp.toString();
        }
        return res;
    }
}
