package com.ji.algo.L851_900;/*
    user ji
    data 2019/5/16
    time 11:20 PM
*/

import java.util.ArrayList;
import java.util.List;

public class BuddyString {
    public static void main(String[] args) {

    }

    public boolean buddyStrings(String A, String B) {
        if (A == null && A == B)
            return true;
        if (A.length() != B.length()) {
            return false;
        }
        int count = 0;
        char a = ',', b = '.';
        int tmp = 0;
        int arr[] = new int[26];
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                count++;
                if (count == 1) {
                    a = A.charAt(i);
                    b = B.charAt(i);
                } else {
                    if (a == B.charAt(i) && b == A.charAt(i))
                        continue;
                    else
                        return false;
                }
            } else {
                arr[A.charAt(i) - 'a'] += 1;
                tmp = Math.max(tmp, arr[A.charAt(i) - 'a']);
            }
            if (count > 2)
                return false;
        }
        if (count == 0)
            return tmp >= 2;
        return count==2;
    }
}
