package com.ji.algo.L0_100;/*
    user ji
    data 2019/4/3
    time 5:44 PM
*/

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aabaab!bb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (null == s || s.equals(""))
            return 0;
        int answer = 0;
        StringBuffer sp = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (sp.indexOf(s.charAt(i) + "") == -1) {
                sp.append(s.charAt(i));
                answer = Math.max(answer, sp.length());
            } else {
                sp = new StringBuffer(sp.substring(sp.indexOf(s.charAt(i) + "")+1));
                sp.append(s.charAt(i));
                answer = Math.max(answer, sp.length());
            }

        }
        return answer;
    }
}
