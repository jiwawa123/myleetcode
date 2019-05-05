package com.ji.algo.L401_450;/*
    user ji
    data 2019/5/5
    time 8:47 PM
*/

public class CountSegments {
    public static void main(String[] args) {
        System.out.println(countSegments("  ,"));
    }

    public static int countSegments(String s) {
        if (null == s || s.trim().equals(""))
            return 0;
        s = s.trim();
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (flag) {
                    count++;
                    flag = false;
                }
            } else {
                flag = true;
            }
        }
        return count + 1;
    }
}
