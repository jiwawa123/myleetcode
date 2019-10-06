package com.ji.algo.game;/*
    user ji
    data 2019/9/30
    time 8:41 AM
*/

public class DeleteString {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("deeedbbcccbdaa", 3));
    }

    public static String removeDuplicates(String s, int k) {
        if (s.length() < k)
            return s;
        if (k == 1)
            return "";
        char c = s.charAt(0);
        int index = 1;
        int len = 1;
        while (index < s.length()) {
            if (s.charAt(index) == c) {
                len++;
                if (len == k) {//开始使用递归操作
                    return removeDuplicates(s.substring(0, index - len + 1) + s.substring(index + 1, s.length()), k);
                }
            } else {
                len = 1;
                c = s.charAt(index);
            }
            index++;
        }
        return s;
    }


}
