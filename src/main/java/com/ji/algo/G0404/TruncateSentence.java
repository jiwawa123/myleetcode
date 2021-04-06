package com.ji.algo.G0404;

/**
 * user ji
 * data 2021/4/4
 * time 10:01 下午
 */
public class TruncateSentence {
    public static void main(String[] args) {

    }

    public String truncateSentence(String s, int k) {
        StringBuilder sp = new StringBuilder();
        String[] tmp = s.split(" ");
        for (int i = 0; i < k; i++) {
            sp.append(tmp[i]);
            if (i != k - 1)
                sp.append(" ");
        }
        return sp.toString();
    }
}
