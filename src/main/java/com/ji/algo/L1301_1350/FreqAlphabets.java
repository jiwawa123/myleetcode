package com.ji.algo.L1301_1350;/*
    user ji
    data 2020/1/5
    time 8:30 PM
*/

public class FreqAlphabets {
    public static void main(String[] args) {

    }

    public String freqAlphabets(String s) {
        String string[] = s.split("#");
        StringBuilder sp = new StringBuilder();
        int l = s.length();
        for (int i = 0; i < string.length - 1; i++) {
            String tmp = string[i];
            int len = tmp.length();
            if (len >= 2) {
                for (int j = 0; j < len - 2; j++) {
                    sp.append((char)('a'+ tmp.charAt(j) - '0' - 1));
                }
                char t = (char) (Integer.valueOf(tmp.substring(len - 2, len)) + 'a' -1);
                sp.append(t);
            } else {
                for (int j = 0; j < len ; i++) {
                    sp.append((char)('a'+ tmp.charAt(j) - '0' - 1));
                }
            }
        }
        if(s.charAt(l-1)=='#'){
            String tmp = string[string.length-1];
            int len = tmp.length();
            for (int j = 0; j < len - 2; j++) {
                sp.append((char)('a'+ tmp.charAt(j) - '0' -1));
            }
            char t = (char) (Integer.valueOf(tmp.substring(len - 2, len)) + 'a' -1);
            sp.append(t);
        }else{
            String tmp = string[string.length-1];
            int len = tmp.length();
            for (int j = 0; j < len; j++) {
                sp.append((char)('a'+ tmp.charAt(j) - '0' -1));
            }
        }


        return sp.toString();
    }
}
