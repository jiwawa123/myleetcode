package com.ji.algo.L451_500;/*
    user ji
    data 2019/5/3
    time 7:36 PM
*/

public class LicenseKeyFormatting {
    public static void main(String[] args) {
        licenseKeyFormatting("---" ,
                3);
    }

    public static String licenseKeyFormatting(String S, int K) {
        String ss = S.toUpperCase();
        StringBuffer sp = new StringBuffer();
        for (int i = 0; i < ss.length(); i++) {
            if (ss.charAt(i) != '-')
                sp.append(ss.charAt(i));
        }
        String s1 = sp.toString();
        int len = sp.length() % K;
        StringBuffer sp1 = new StringBuffer();
        int index = 0;
        if (len != 0) {
            sp.append(s1.substring(0, len));
            sp.append('-');
            index = len;
        }
        while (index < s1.length()) {
            sp1.append(s1.substring(index, index + K));
            index += K;
        }
        if(sp1.length()==0)
            return sp1.toString();
        return sp1.toString().substring(0,sp1.length()-1);
    }
}
