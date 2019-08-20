package com.ji.algo.L351_400;/*
    user ji
    data 2019/5/3
    time 7:50 PM
*/

public class IsSubSequence {
    public static void main(String[] args) {

    }
    public boolean isSubSequence(String s,String t){
        if(s==null&&t==null)
            return true;
        if(s.equals(""))
            return true;
        if(s.length()<t.length())
            return false;
        int i = 0;
        while(i<s.length()){
            int index = t.indexOf(s.charAt(i));
            if(index==-1)
                return false;
            t = t.substring(index+1,t.length());
            i++;
        }
        return true;
    }
    public int longestSubString(String s1, String s2) {
        int arr[][] = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i < s1.length() + 1; i++) {
            arr[i][0] = 0;
        }
        for (int i = 0; i < s2.length(); i++) {
            arr[0][i] = 0;
        }
        int count = 0;
        for (int i = 1; i < s1.length() + 1; i++) {
            for (int j = 1; j < s2.length() + 1; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    arr[i][j] = 1 + arr[i - 1][j - 1];
                } else {
                    arr[i][j] = Math.max(arr[i][j - 1], arr[i - 1][j]);
                }
            }
        }
        return arr[s1.length()][s2.length()];
    }
}
