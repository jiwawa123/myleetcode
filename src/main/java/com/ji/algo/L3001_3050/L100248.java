package com.ji.algo.L3001_3050;

/**
 * @Author: Bei Chang
 * @Date: 2024/03/18/08:27
 */
public class L100248 {
    public static void main(String[] args) {

    }

    public boolean isSubstringPresent(String s) {
        StringBuilder sp = new StringBuilder();
        sp.append(s);
        String tmp = sp.reverse().toString();
        for (int i = 0; i < s.length() - 1; i++) {
            if(tmp.contains(s.substring(i,i+2))){
                return true;
            }
        }

        return false;
    }
}
