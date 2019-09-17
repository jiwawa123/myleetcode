package com.ji.algo.L1051_1100;/*
    user ji
    data 2019/9/17
    time 11:57 AM
*/

public class KLen {
    public static void main(String[] args) {
        System.out.println(getRepeate("havefunonleetcode",5));
    }

    public static int getRepeate(String tmp, int k) {
        if (tmp == null || tmp.length() < k)
            return 0;
        String sp = "";
        int i = 0;
        int count = 0;
        while (i < tmp.length()) {
            int index = sp.indexOf(tmp.charAt(i));
            sp = index == -1 ? sp + tmp.charAt(i) : sp.substring(index + 1, sp.length()) + tmp.charAt(i);
            if (sp.length() == k) {
                count++;
                sp = sp.substring(1, sp.length());
            }
            i++;
        }
        return count;
    }
}
