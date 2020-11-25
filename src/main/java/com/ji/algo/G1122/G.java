package com.ji.algo.G1122;

/**
 * user ji
 * data 2020/11/22
 * time 6:05 下午
 */
public class G {
    public static void main(String[] args) {

    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sp = new StringBuilder();
        StringBuilder sp1 = new StringBuilder();
        for (String tmp:word1
             ) {
            sp.append(tmp);
        }
        for (String tmp:word2
             ) {
            sp1.append(tmp);
        }
        return sp.toString().equals(sp1.toString());
    }
}
