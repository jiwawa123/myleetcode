package com.ji.algo.L801_850;/*
    user ji
    data 2019/5/14
    time 5:25 PM
*/

public class ToGoatLatin {
    public static void main(String[] args) {

    }

    public String toGoatLatin(String S) {
        StringBuilder sp = new StringBuilder();
        String string[] = S.split(" ");
        for (int i = 0; i < string.length; i++) {
            StringBuilder tmp = new StringBuilder();
            if (isGo(string[i].charAt(0))) {
                tmp.append(string[i]);
                tmp.append("ma");
            } else {
                tmp.append(string[i].substring(1, string[i].length()));
                tmp.append(string[i].charAt(0));
            }
            int k = i + 1;
            while (k > 0) {
                tmp.append("a");
                k--;
            }
            sp.append(tmp);
            if (i != string.length - 1)
                sp.append(" ");
        }

        return sp.toString();
    }

    public boolean isGo(char a) {
        return a == 'I' || a == 'i' || a == 'e' || a == 'E' || a == 'o' || a == 'O' || a == 'a' || a == 'A' || a == 'u' || a == 'U';
    }
}
