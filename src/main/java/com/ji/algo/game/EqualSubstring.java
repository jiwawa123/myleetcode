package com.ji.algo.game;/*
    user ji
    data 2019/9/30
    time 9:09 AM
*/

public class EqualSubstring {
    public static void main(String[] args) {
        String s = "krrgw", t = "zjxss";
        System.out.println(equalSubstring(s, t, 19));
    }

    public static int equalSubstring(String s, String t, int maxCost) {
        int length = s.length();
        int i = 0;
        int j = i;
        int maxlength = 0;
        int cost = maxCost;
        while (i != length) {
            if (Math.abs(s.charAt(i) - t.charAt(i)) > cost) {
                if (i - j > maxlength) maxlength = i - j;
                cost = Math.abs(s.charAt(j) - t.charAt(j)) + cost;
                j++;
            } else {
                cost = cost - Math.abs(s.charAt(i) - t.charAt(i));
                i++;
            }
        }
        if (i - j > maxlength) maxlength = i - j;
        return maxlength;
    }
}
