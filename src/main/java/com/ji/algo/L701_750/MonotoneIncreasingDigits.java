package com.ji.algo.L701_750;/*
    user ji
    data 2019/8/8
    time 9:42 AM
*/

public class MonotoneIncreasingDigits {
    public static void main(String[] args) {

    }

    public static int monotoneIncreasingDigits(int n) {
        String s = "" + n;
        int length = s.length();
        char[] chars = s.toCharArray();
        int flag = length;
        for (int i = length - 1; i >= 1; i--) {
            if (chars[i] < chars[i - 1]) {
                flag = i;
                chars[i - 1]--;
            }
        }

        for (int i = flag; i < length; i++) {
            chars[i] = '9';
        }
        return Integer.parseInt(new String(chars));

    }
}
