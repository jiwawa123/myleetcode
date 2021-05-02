package com.ji.algo.G0502;

/**
 * user ji
 * data 2021/5/2
 * time 4:38 下午
 */
public class G2 {
    public static void main(String[] args) {

    }

    public String replaceDigits(String s) {
        StringBuilder sp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0)
                sp.append(s.charAt(i));
            else {
                sp.append((char) ((s.charAt(i - 1) + (s.charAt(i) - '0'))));
            }
        }
        return sp.toString();
    }
}
