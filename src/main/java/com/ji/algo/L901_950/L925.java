package com.ji.algo.L901_950;

/**
 * user ji
 * data 2020/10/21
 * time 9:16 上午
 */
public class L925 {
    public static void main(String[] args) {
        String a = "vtkgn";

        String b = "vttkgnn";
        System.out.println(isLongPressedName(a, b));
    }

    public static boolean isLongPressedName(String name, String typed) {
        if (name.length() > typed.length())
            return false;
        int i = 0, j = 0;
        while (i < name.length() || j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
                continue;
            }
            if (i > 0 && typed.charAt(j) == name.charAt(i - 1)) {
                j++;
                continue;
            }
            return false;
        }
        return i == name.length() && j == typed.length();
    }
}
