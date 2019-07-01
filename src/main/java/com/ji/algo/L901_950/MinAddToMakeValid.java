package com.ji.algo.L901_950;/*
    user ji
    data 2019/7/1
    time 10:30 AM
*/

import java.util.Stack;

public class MinAddToMakeValid {
    public static void main(String[] args) {

    }

    public int minAddToMakeValid(String S) {
        int count = 0;
        int left = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(')
                left++;
            else {
                if (left > 0)
                    left--;
                else
                    count++;
            }
        }
        return count + left;
    }
}
