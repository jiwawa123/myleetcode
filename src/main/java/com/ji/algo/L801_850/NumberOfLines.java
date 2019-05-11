package com.ji.algo.L801_850;/*
    user ji
    data 2019/5/11
    time 9:20 PM
*/

public class NumberOfLines {
    public static void main(String[] args) {

    }

    public int[] numberOfLines(int[] widths, String S) {
        if (null == S || S.length() == 0)
            return new int[2];
        int count = 0;
        int line = 1;
        for (int i = 0; i < S.length(); i++) {
            if (widths[S.charAt(i) - 'a'] + count > 100) {
                line++;
                count = widths[S.charAt(i) - 'a'];
            }else{
                count += widths[S.charAt(i) - 'a'];
            }

        }
        int arr[] = {line, count};
        return arr;
    }
}
