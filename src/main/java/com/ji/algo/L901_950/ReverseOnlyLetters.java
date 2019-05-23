package com.ji.algo.L901_950;/*
    user ji
    data 2019/5/23
    time 11:28 PM
*/

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    }

    public static String reverseOnlyLetters(String S) {
        int i = 0, j = S.length() - 1;
        char[] sp = S.toCharArray();
        while (i < j) {
            if ((sp[i] >= 'a' && sp[i] <= 'z') || (sp[i] >= 'A' && sp[i] <= 'Z')) {
                if ((sp[j] >= 'a' && sp[j] <= 'z') || (sp[j] >= 'A' && sp[j] <= 'Z')) {
                    char tmp = sp[i];
                    sp[i] = sp[j];
                    sp[j] = tmp;
                    i++;
                    j--;
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }
        return String.valueOf(sp);
    }
}
