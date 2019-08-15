package com.ji.algo.L801_850;/*
    user ji
    data 2019/8/15
    time 9:39 AM
*/

public class MaskPII {
    public static void main(String[] args) {
        System.out.println(maskPII("+86(88)1513-7-74"));
    }

    public static String maskPII(String S) {
        if (S.contains("@")) {
            S = S.toLowerCase();
            String tmp[] = S.split("@");
            return tmp[0].charAt(0) + "*****" + tmp[0].charAt(tmp[0].length() - 1)
                    + "@" + tmp[1];
        } else {
            StringBuilder sp = new StringBuilder();
            for(int i = 0;i<S.length();i++){
                if(S.charAt(i)>='0'&&S.charAt(i)<='9')
                    sp.append(S.charAt(i));
            }
            S = sp.toString();
            int len = S.length();
            String last = S.substring(S.length() - 4, S.length());
            switch (len) {
                case 10:
                    return "***-***-" + last;
                case 11:
                    return "+*-***-***-" + last;
                case 12:
                    return "+**-***-***-" + last;
                case 13:
                    return "+***-***-***-" + last;

            }
            return "";
        }
    }
}
