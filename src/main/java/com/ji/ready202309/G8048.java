package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/24/15:41
 */
public class G8048 {

    public static void main(String[] args) {

    }

    public String maximumOddBinaryNumber(String s) {
        StringBuilder sp = new StringBuilder();
        int len = s.length();
        int one = 0;
        for (char a : s.toCharArray()
        ) {
            if (a == '1') {
                one++;
            }
        }
        int zero = len - one;
        while (one > 1 || zero > 0) {
            while (one > 1) {
                sp.append(1);
                one--;
            }
            while (zero > 0) {
                sp.append(0);
                zero--;
            }
        }
        sp.append(1);
        return sp.toString();
    }
}
