package com.ji.algo.L151_200;/*
    user ji
    data 2019/4/15
    time 9:15 PM
*/

public class ReverseWord {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }

    public static String reverseWords(String s) {
        s = s.trim();
        String tmp[] = s.split(" ");
        StringBuffer sp = new StringBuffer();
        for (int i = tmp.length - 1; i >= 0; i--) {
            if (tmp[i].equals(""))
                continue;
            sp.append(tmp[i].trim());
            sp.append(" ");
        }
        return sp.toString().trim();
    }
}
