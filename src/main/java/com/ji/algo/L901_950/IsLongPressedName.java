package com.ji.algo.L901_950;/*
    user ji
    data 2019/5/28
    time 1:43 PM
*/

public class IsLongPressedName {
    public static void main(String[] args) {
        System.out.println(isLongPressedName("xiaaaaoming", "xxiiiiaaaoooming"));
    }

    public static boolean isLongPressedName(String name, String typed) {
        if (name == null && typed == null)
            return true;
        if (typed == null || name.length() > typed.length())
            return false;
        int count = 0;
        int count_1 = 0;
        char t1 = 'a';
        char t2 = 'b';
        int i = 0, j = 0;
        while (i < name.length() && j < typed.length()) {
            if (count == 0) {
                t1 = name.charAt(i);
                count++;
            }
            while (i < name.length() - 1 && name.charAt(i + 1) == t1) {
                count++;
                i++;
            }
            if (count_1 == 0) {
                t2 = typed.charAt(j);
                count_1++;
            }
            while (j < typed.length() - 1 && typed.charAt(j + 1) == t2) {
                j++;
                count_1++;
            }
            if (t1 != t2 || count > count_1) {
                return false;
            } else {
                count = 0;
                count_1 = 0;
                i++;
                j++;
            }

        }
        return i == name.length() && j == typed.length();
    }
}
