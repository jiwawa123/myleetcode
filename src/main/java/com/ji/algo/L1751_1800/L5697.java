package com.ji.algo.L1751_1800;

/**
 * user ji
 * data 2021/3/7
 * time 10:09 下午
 */
public class L5697 {
    public static void main(String[] args) {
        System.out.println(checkOnesSegment("110"));
    }

    public static boolean checkOnesSegment(String s) {
        int index = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                if (i == index + 1)
                    index = i;
                else
                    return false;
            }
        }
        return true;
    }
}
