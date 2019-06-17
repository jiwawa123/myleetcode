package com.ji.algo.L951_1000;/*
    user ji
    data 2019/6/17
    time 4:44 PM
*/

public class StrWithout3a3b {
    public static void main(String[] args) {

    }

    public String strWithout3a3b(int A, int B) {
        //保证A > B
        char a = 'a', b = 'b';
        StringBuilder sp = new StringBuilder();
        if (A > B) {
            int tmp = A;
            A = B;
            B = tmp;
            a = 'b';
            b = 'a';
        }
        while (A > 0 || B > 0) {
            if (A > 0) {
                sp.append(a);
                A--;
            }
            if (A > B) {
                sp.append(a);
                A--;
            }
            if (B > 0) {
                sp.append(b);
                B--;
            }

        }
        return sp.toString();
    }

}
