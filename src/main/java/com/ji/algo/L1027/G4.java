package com.ji.algo.L1027;/*
    user ji
    data 2019/10/27
    time 10:56 AM
*/

public class G4 {
    public static void main(String[] args) {

    }

    public int tilingRectangle(int n, int m) {
        if (n == m)
            return 1;
        if (n == 1)
            return m;
        if (m == 1)
            return n;
        if (n % m == 0)
            return n % m;
        if (m % n == 0)
            return m % n;
        return 0;

    }
}
