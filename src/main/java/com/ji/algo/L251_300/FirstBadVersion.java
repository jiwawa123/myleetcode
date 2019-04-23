package com.ji.algo.L251_300;/*
    user ji
    data 2019/4/23
    time 8:45 PM
*/

public class FirstBadVersion {
    public static void main(String[] args) {

    }

    public int firstBadVersion(int n) {
        if (n == 1)
            return n;
        if (isBadVersion(n) && !isBadVersion(n - 1))
            return n;
        int i = 0, j = n;
        while (i < j) {
            int med = i + (j - i) / 2;
            if (isBadVersion(med)) {
                if (med == 1 || !isBadVersion(med - 1))
                    return med;
                j = med - 1;
            } else {
                i = med + 1;
            }
        }
        return i;
    }

    private boolean isBadVersion(int n) {
        return true;
    }
}
