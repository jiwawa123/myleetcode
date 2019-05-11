package com.ji.algo.L751_800;/*
    user ji
    data 2019/5/11
    time 8:52 PM
*/

public class RotateString {
    public boolean rotateString(String A, String B) {
        if (A == null && A == B)
            return true;
        if (A == null || B == null || A.length() != B.length())
            return false;
        if (A.equals(B))
            return true;
        int i = 0;
        while (i < A.length()) {
            String tmp = A.substring(1, A.length()) + A.charAt(0);
            if (tmp.equals(B))
                return true;
            A = tmp;
            i++;
        }
        return false;
    }
}
