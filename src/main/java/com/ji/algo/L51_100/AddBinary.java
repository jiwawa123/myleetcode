package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/9
    time 4:54 PM
*/

public class AddBinary {
    public static void main(String[] args) {
        addBinary("11", "1");
    }

    public static String addBinary(String a, String b) {
        char[] atmp = a.toCharArray();
        char[] btmp = b.toCharArray();
        StringBuffer sp = new StringBuffer();
        int i = atmp.length - 1, j = btmp.length - 1;
        int next = 0;
        while (i >= 0 && j >= 0) {
            int at = atmp[i--] - '0';
            int bt = btmp[j--] - '0';
            sp.append((at + bt + next) % 2);
            next = (at + bt + next) / 2;
        }
        while (i >= 0) {
            int at = atmp[i--] - '0';
            sp.append((at + next) % 2);
            next = (at + next) / 2;
        }
        while (j >= 0) {
            int bt = btmp[j--] - '0';
            sp.append((bt + next) % 2);
            next = (bt + next) / 2;
        }
        if (next > 0) {
            sp.append(next);
        }
        return sp.reverse().toString();
    }
}
