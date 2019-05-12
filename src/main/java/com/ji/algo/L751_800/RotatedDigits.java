package com.ji.algo.L751_800;/*
    user ji
    data 2019/5/12
    time 8:46 AM
*/

import java.util.HashMap;
import java.util.Map;

public class RotatedDigits {
    public static void main(String[] args) {
        new RotatedDigits().rotatedDigits(10);
    }

    public int rotatedDigits(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isValid(i)) {
                count++;
            }
        }
        return count;
    }

    public boolean isValid(int n) {
        int t = n;
        int arr[] = new int[10];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[5] = 2;
        arr[6] = 9;
        arr[8] = 8;
        arr[9] = 6;
        String tmp = n + "";
        StringBuffer sp = new StringBuffer();
        while (n > 0) {
            if (n % 10 == 3 || n % 10 == 4 || n % 10 == 7)
                return false;
            sp.append(arr[n % 10]);
            n /= 10;
        }
        return !sp.reverse().toString().equals(t + "");
    }
}
