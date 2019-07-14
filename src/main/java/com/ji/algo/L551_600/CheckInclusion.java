package com.ji.algo.L551_600;/*
    user ji
    data 2019/7/14
    time 5:43 PM
*/

public class CheckInclusion {
    public static void main(String[] args) {
        CheckInclusion ci = new CheckInclusion();
        System.out.println(ci.checkInclusion("ab", "bba"));
    }

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        for (int i = 0; i < s2.length(); i ++) {
            if (i + s1.length() > s2.length())
                return false;
            if (match(s1, s2.substring(i, i + s1.length())))
                return true;
        }
        return false;
    }

    public boolean match(String a, String b) {
        int arr[] = new int[26];
        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < b.length(); i++) {
            if (arr[b.charAt(i) -'a']<= 0)
                return false;
            arr[b.charAt(i) - 'a'] -= 1;

        }
        return true;
    }
}