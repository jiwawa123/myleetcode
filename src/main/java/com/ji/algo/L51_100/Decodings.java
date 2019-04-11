package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/11
    time 10:18 AM
*/

import java.util.*;

public class Decodings {
    public static void main(String[] args) {
        System.out.println(numDecodings("101"));
    }

    public static int numDecodings(String s) {
        if (null == s || s.charAt(0) == '0' || s.contains("00"))
            return 0;
        int arr[] = new int[s.length()];
        arr[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if (s.charAt(i - 1) > '2') {
                    return 0;
                } else {
                    if (i == 1){
                        arr[i] = 1;
                        continue;
                    }
                    arr[i] = arr[i - 2];
                    continue;
                }
            }
            if(s.charAt(i-1)=='0'){
                arr[i] = arr[i-1];
                continue;
            }
            String ttt = "" + s.charAt(i - 1) + s.charAt(i);
            int tmp = Integer.valueOf(ttt);
            if (tmp > 26) {
                arr[i] = arr[i - 1];
            } else {
                if (i == 1) {
                    arr[i] = 2;
                } else {
                    arr[i] = arr[i - 1] + arr[i - 2];
                }
            }
        }
        return arr[s.length() - 1];
    }


}
