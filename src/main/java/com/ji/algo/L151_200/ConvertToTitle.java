package com.ji.algo.L151_200;/*
    user ji
    data 2019/4/16
    time 4:58 PM
*/

public class ConvertToTitle {
    public static void main(String[] args) {
        //System.out.println(26*26);
        System.out.println(convertToTitle(702));
    }

    public static String convertToTitle(int n) {
        if (n <= 26) {
            return (char) ('A' + n - 1) + "";
        }
        StringBuffer sp = new StringBuffer();
        while (n > 0) {
            int tmp = n % 26;
            if (tmp == 0) {
                sp.append("K");
                n -= 26;
            } else {
                sp.append((char) ('A' + tmp - 1));
            }
            n /= 26;
        }
        return sp.reverse().toString();

    }
    public String convertToTitleII(int n) {
        String result = "";
        while (n>0) {
            result += (char) ('A' + (n - 1) % 26);
            n = (n - 1) / 26;
        }
        return new StringBuffer(result).reverse().toString();
    }
}
