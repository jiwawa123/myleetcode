package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/15
    time 2:54 PM
*/

public class IsPalindrome {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if(!isMatch(s.charAt(i))){
                i++;
                continue;
            }
            if(!isMatch(s.charAt(j))){
                j--;
                continue;
            }
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }

        }
        return true;
    }

    public boolean isMatch(char a) {
        return (a >= '0' && a <= '9')||(a>='a'&&a<='z');
    }
}
