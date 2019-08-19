package com.ji.algo.L1151_1200;/*
    user ji
    data 2019/8/19
    time 1:44 PM
*/

public class MaxRepOpt1 {
    public static void main(String[] args) {
        System.out.println(maxRepOpt1("bbababaaaa"));
    }

    public static int maxRepOpt1(String text) {
        int min = 0;
        if (text == null || text.length() == 0)
            return min;
        for (int i = 0; i < text.length(); i++) {
            if (text.length() - i < min)
                break;
            char a = text.charAt(i);
            int l = 1;
            int r = -1;
            int d = 0;
            int index = text.length();
            for (int j = i + 1; j < text.length(); j++) {
                if (a == text.charAt(j)) {
                    if (r >= 0)
                        r++;
                    else
                        l++;
                } else {
                    d++;
                    if (d > 1) {
                        index = j;
                        break;
                    }
                    r++;
                }
            }
            if (d > 0) {
                if (text.substring(index, text.length()).indexOf(a) == -1 && text.substring(0, Math.max(0, i - 1)).indexOf(a) == -1) {
                    min = Math.max(min, l + r);
                } else {
                    min = Math.max(min, l + r + 1);
                }
            }
            min = Math.max(min, l);
        }
        return min;
    }
}
