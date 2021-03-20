package com.ji.algo.L1751_1800;

/**
 * user ji
 * data 2021/3/20
 * time 12:12 下午
 */
public class L1790 {
    public static void main(String[] args) {

    }

    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2))
            return true;
        char c = ' ';
        char c1 = ' ';
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (count == 2)
                    return false;
                if (count == 1) {
                    if (c != s2.charAt(i) || c1 != s1.charAt(i))
                        return false;
                    count++;
                } else {
                    c = s1.charAt(i);
                    c1 = s2.charAt(i);
                    count++;
                }
            }
        }


        return true;
    }
}
