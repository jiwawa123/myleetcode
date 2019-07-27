package com.ji.algo.L851_900;/*
    user ji
    data 2019/7/27
    time 3:14 PM
*/

public class ReorderedPowerOf2 {
    public static void main(String[] args) {
        System.out.println(new ReorderedPowerOf2().reorderedPowerOf2(46));
    }

    public boolean reorderedPowerOf2(int N) {
        if (N <= 2)
            return true;
        int tmp = 2;
        while ((tmp + "").length() <= (N + "").length()) {
            if ((tmp + "").length() < (N + "").length()) {
                tmp *= 2;
            } else {
                if (help(tmp + "", N + ""))
                    return true;
                tmp *= 2;
            }
        }
        return false;
    }

    public boolean help(String a, String b) {
        if (a.length() != b.length())
            return false;
        int arr[] = new int[10];
        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) - '0'] += 1;
        }
        for (int i = 0; i < b.length(); i++) {
            if (arr[b.charAt(i) - '0'] == 0)
                return false;
            else
                arr[b.charAt(i) - '0'] -= 1;
        }
        return true;
    }
}
